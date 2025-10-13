package com.victor.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//Importo map
import java.util.Map;

//Quito el import de controller
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//Importo el rest controller
import org.springframework.web.bind.annotation.RestController;

//Importo el objeto user de la clase users

import com.victor.curso.springboot.webapp.springboot_web.models.User;
import com.victor.curso.springboot.webapp.springboot_web.models.DTO.UserDTO;
import org.springframework.web.bind.annotation.RequestParam;


/*
 * Voy a convertir este controller en un Api
 * 
 * Declaro un RestController y lo importo
 * 
 * Devolverá un JSON(Java Script Objet Notation)
 * 
 */
@RestController
// Añado la ruta de la api
@RequestMapping("/api")
public class UserRestController {

    /* Este está hecho con DTO 
     * Este objeto no se mostrará en el cliente ya que puede contener información sensible.
     * Para poder verlo se hará desde la api: http://localhost:8090/api/details
     
    */

    @GetMapping("/details")

    @ResponseBody

    public UserDTO details() {

        User user = new User("Víctor", "Mena");

        // Creo el objeto user DTO

        UserDTO userDTO = new UserDTO();

        userDTO.setUser(user);

        userDTO.setTitle("Título enviado desde un objeto DTO!");

        return userDTO;

    }

    /*
     * Este está hecho con map.
     */

    @GetMapping("/details-map") // Equivalente -> @RequestMapping(path="/details", method = RequestMethod.GET)

    // Indico que la resouesta será de tipo JSON
    @ResponseBody

    public Map<String, Object> detailsMap() {

        // Creo un objeto

        User user = new User("Germán", "Doblas");

        // Instancio e importo el map
        // Declaro el tipo de objeto que va a devolver
        Map<String, Object> body = new HashMap<>();

        body.put("title", "HOLA LANZADO DESDE API MI GENTE");

        // En vez de nombre y apellido paso el objeto user
        body.put("user", user);

        return body;

    }

    /*
     * Voy a enviar una lista de usuarios.
     * 
     * Para ello agrego un nuevo método.
     */
@GetMapping("/list")
     public List <User> list(){

        User user = new User("Judit", "Lamata");

        User user2 = new User("Adrián", "Novo");

        User user3 = new User("Álvaro", "Tornero");

        // List<User> users = new ArrayList<>();

        // users.add(user);

        // users.add(user2);

        // users.add(user3);

        //El array con la lista se puede simplificar así:

        List<User> users = Arrays.asList(user, user2, user3);

        return users;

     }




}

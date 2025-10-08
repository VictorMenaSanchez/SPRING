package com.victor.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
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

/*
 * Voy a convertir este controller en un Api
 * 
 * Declaro un RestController y lo importo
 * 
 * Devolverá un JSON(Java Script Objet Notation)
 * 
 */
 @RestController
 //Añado la ruta de la api
@RequestMapping("/api")
public class UserRestController {

 @GetMapping("/details")//Equivalente -> @RequestMapping(path="/details", method = RequestMethod.GET)

 //Indico que la resouesta será de tipo JSON
 @ResponseBody
 
    public Map<String, Object> details(){


        //Creo un objeto

        User user = new User("Germán", "Doblas");



        //Instancio e importo el map
        //Declaro el tipo de objeto que va a devolver
        Map <String, Object> body = new HashMap<>();

         body.put("title", "HOLA LANZADO DESDE API MI GENTE");

         //En vez de nombre y apellido paso el objeto user
         body.put("user", user);

        
        return body;

    }


}

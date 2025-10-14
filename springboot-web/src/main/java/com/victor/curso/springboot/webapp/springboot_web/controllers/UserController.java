package com.victor.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.victor.curso.springboot.webapp.springboot_web.models.User;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Un controlador es una clase común y corriente ya que maneja métodos del
 * request.
 * 
 * Se conocen como métodos handler.
 * 
 * Se llaman métodos handler porque manejan peticiones de usuarios.
 * 
 * Procesa los request y devuelve response.
 * 
 * Para indicar que es una clase controladora, hay que poner una anotación con @
 * 
 * Esta anotación es importante para indicar que es un controlador de spring.
 * 
 * Tamnbién es una especialización de un componente.
 * 
 * En los return a la vista tengo que devolver el nombre de la plantilla html
 * como un String.
 * 
 * 
 */

@Controller

public class UserController {
    /**
     * 
     * Tengo que indicar que el método es un handler.
     * 
     * Es decir, un método que va a manejar una petición del request.
     * 
     * Un request tiene distintos tipos o métodos, se puede enviar un get, un
     * post,un put, un delete...
     * 
     * Por ejemplo en este caso usaré @getmapping que es para cualquier petición que
     * sea a través de una ruta.
     * 
     */

    @GetMapping("/details")

    public String details(Model model) {

        /*
         * Desde aquí paso datos a la vista.
         * 
         * Se hace desde la inyección de dependencias de Spring.
         * 
         * Tengo que pasarle e importar el parámetro model de spring.
         */
        // Llamo a los parámetros del objeto user
        User user = new User("Germán", "Doblas");
        model.addAttribute("title", "HOLA MI GENTE");

        user.setEmail("gerzor@carteras.com");

        model.addAttribute("user", user);

        // model.addAttribute("lastname", "Mena");

        // Plantilla HTML
        return "details";

    }

    /*
     * Se puede hacer con map de java.util
     * 
     * public String details(Map<String, Objet>model){
     * 
     * model.put("title", "HOLA MI GENTE");
     * 
     * model.put("name", "Víctor");
     * 
     * model.put("lastname", "Mena");
     * 
     * 
     * return "details";
     * 
     * }
     */

    /*
     * Voy a implementar un nuevo método en este controlador para crear listas en
     * thymeleaf.
     *
     * Será una lista de usuarios que será reenderizada en la vista.
     * 
     * Lo primero será declarar un método del tipo getMapping, con la url
     * específica.
     */

    @GetMapping("/list")
    public String list(ModelMap model) {

        // model.addAttribute("users", users);

        model.addAttribute("title", "Listado de usuarios.");

        return "list";

    }
    
/*
 * @ModelAttribute es una anotación de Spring MVC que se usa para pasar datos entre el controlador y la vista (Thymeleaf).
 * 
 * En este caso lo estoy usando como un método del controlador para que su valor esté siempre disponible.
 * 
 * Es decir, podría reenderizar la tabla users en details también.
 */

@ModelAttribute("users")

    public List<User> userModel() {

        return Arrays.asList(
                new User("Mario", "Gutierrez", "mario@corazones.com"),
                new User("Cristian", "Sánchez", "cris@himenes.sex"),
                new User("Gar", "Saxon", "mando@beskar.man"),
                new User("Darth", "Vader"));

        
    }

}

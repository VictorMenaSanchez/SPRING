package com.victor.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.victor.curso.springboot.webapp.springboot_web.models.User;



/**
 * Un controlador es una clase común y corriente ya que maneja métodos del request.
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
 * En los return a la vista tengo que devolver el nombre de la plantilla html como un String.
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
 * Un request tiene distintos tipos o métodos, se puede enviar un get, un post,un put, un delete...
 * 
 * Por ejemplo en este caso usaré @getmapping que es para cualquier petición que sea a través de una ruta.
 * 
 */

 @GetMapping("/details")
 
    public String details(Model model){

        /*
         * Desde aquí paso datos a la vista.
         * 
         * Se hace desde la inyección de dependencias de Spring.
         * 
         * Tengo que pasarle e importar el parámetro model de spring.
         */
        //Llamo a los parámetros del objeto user
        User user = new User("Germán", "Doblas");
         model.addAttribute("title", "HOLA MI GENTE");

         model.addAttribute("user", user);

         //model.addAttribute("lastname", "Mena");

        //Plantilla HTML
        return "details";

    }

/* 
Se puede hacer con map de java.util

    public String details(Map<String, Objet>model){

         model.put("title", "HOLA MI GENTE");

         model.put("name", "Víctor");

         model.put("lastname", "Mena");

       
        return "details";

    }
*/
}

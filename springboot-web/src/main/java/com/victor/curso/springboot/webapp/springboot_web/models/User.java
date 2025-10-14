package com.victor.curso.springboot.webapp.springboot_web.models;

public class User {


    //Atributos

    private String name;
    
    private String lastname;

    private String email;



    
    //Genero un constructor con los atributos click izquierdo- source action - generate getters y setters

    public User(String name, String lastname, String email) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

      public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }


    //Genero los getters y setters click izquierdo-source action- generate getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    

}

package com.victor.curso.springboot.webapp.springboot_web.models.DTO;

import com.victor.curso.springboot.webapp.springboot_web.models.User;

/*Aquí creo un objeto DTO */

public class UserDTO {

private String title;

private User user;

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public User getUser() {
    return user;
}

public void setUser(User user) {
    this.user = user;
}



}

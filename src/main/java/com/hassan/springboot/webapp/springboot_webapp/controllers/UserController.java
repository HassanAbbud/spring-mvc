package com.hassan.springboot.webapp.springboot_webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hassan.springboot.webapp.springboot_webapp.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details (Model model){
        User user = new User("Hassan", "Abbud");
        model.addAttribute( "title", "Spring Boot app");
        model.addAttribute( "message", "Hello World");
        model.addAttribute( "user", user );
        return "details";
    }
}

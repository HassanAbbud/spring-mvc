package com.hassan.springboot.webapp.springboot_webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details (Model model){
    model.addAttribute( "title", "Spring Boot app");
    model.addAttribute( "message", "Hello World");
    model.addAttribute( "name", "Hassan");
    model.addAttribute( "lastname", "Abbud");
        return "details";
    }
}

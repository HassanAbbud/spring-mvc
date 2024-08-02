package com.hassan.springboot.webapp.springboot_webapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

    @GetMapping("list")
    public String list(ModelMap model) {

        List<User> users = Arrays.asList(
            new User("Jose", "Loya"),
            new User("Santi", "Perez", "Santi@hotmail.com"),
            new User("Andres", "Manuel")
        );

        model.addAttribute("title", "User list");
        model.addAttribute("users", users);
        return "list";
    }
    
    @ModelAttribute("users")
    public List<User> usersModel(){
        return Arrays.asList(
            new User("Jose", "Loya"),
            new User("Santi", "Perez", "Santi@hotmail.com"),
            new User("Andres", "Manuel")
        );
    }
}

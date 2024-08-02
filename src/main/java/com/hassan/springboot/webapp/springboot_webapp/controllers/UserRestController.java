package com.hassan.springboot.webapp.springboot_webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.hassan.springboot.webapp.springboot_webapp.models.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping()
    public Map<String, Object> details() {
        
        User user = new User("Hassan", "Abbud");
        Map<String, Object> body = new HashMap<>();
            body.put( "title", "Spring Boot app");
            body.put( "message", "Hello World");
            body.put( "user", user);
        return body;
    }
}

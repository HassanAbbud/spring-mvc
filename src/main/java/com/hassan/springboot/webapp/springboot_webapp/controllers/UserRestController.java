package com.hassan.springboot.webapp.springboot_webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping()
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
            body.put( "title", "Spring Boot app");
            body.put( "message", "Hello World");
            body.put( "name", "Hassan");
            body.put( "lastname", "Abbud");
        return body;
    }
}

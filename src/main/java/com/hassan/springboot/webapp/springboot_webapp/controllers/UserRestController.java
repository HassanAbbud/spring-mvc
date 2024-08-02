package com.hassan.springboot.webapp.springboot_webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.hassan.springboot.webapp.springboot_webapp.models.User;
import com.hassan.springboot.webapp.springboot_webapp.models.dto.UserDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public UserDto details() {
        
        UserDto userDto = new UserDto();
        User user = new User("Hassan", "Abbud");

        userDto.setTitle("Spring Boot app");
        userDto.setUser(user);
        
        return userDto;
    }

    @GetMapping(path = "/details-map")
    public Map<String, Object> detailsMap() {
        
        User user = new User("Hassan", "Abbud");
        Map<String, Object> body = new HashMap<>();
            body.put( "title", "Spring Boot app");
            body.put( "message", "Hello World");
            body.put( "user", user);
        return body;
    }
}

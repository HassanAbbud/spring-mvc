package com.hassan.springboot.webapp.springboot_webapp.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

    public List<User> list(){
        User user1 = new User("Jose", "Loya");
        User user2 = new User("Andres", "Arzaga");
        User user3 = new User("Jhon", "Doe");


        List<User> users = Arrays.asList(user1, user2, user3);
        // List<User> users = new ArrayList<>();
        // users.add(user1);
        // users.add(user2);
        // users.add(user3);

        return users;
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

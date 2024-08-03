package com.hassan.springboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hassan.springboot.webapp.springboot_webapp.models.User;
import com.hassan.springboot.webapp.springboot_webapp.models.dto.ParamDto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        //Query example: http://localhost:8080/api/var/baz/My%20message
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> multiplePathVariable(@PathVariable String product, @PathVariable Long id) {
        //Query example: http://localhost:8080/api/var/mix/Keyboard/10
        Map<String, Object> json = new HashMap<>(); 
        json.put("product", product);
        json.put("id", id);

        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        
        user.setName(user.getName().toUpperCase());
        return user;
    }
    
    
}

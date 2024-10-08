package com.hassan.springboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hassan.springboot.webapp.springboot_webapp.models.User;
import com.hassan.springboot.webapp.springboot_webapp.models.dto.ParamDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/var")
public class PathVariableController {
    //Get individual config properties
    @Value("${config.code}")
    private Integer code;

    @Value("${config.name}")
    private String name;

    @Value("${config.message}")
    private String message;

    @Value("${config.listOfValues}")
    private String[] list;
    
    @Value("#{'${config.listOfValues}'.toUpperCase()}")
    private List<String> listUpper;

    @Value("${config.specialCharacters}")
    private String specialCharacters;

    @Value("#{${config.valuesMap}}")
    private Map<String,Object> valuesMap;
    
    @Value("#{${config.valuesMap}.price}")
    private String valuesMapPrice;
    
    @Value("#{${config.valuesMap}.product}")
    private String valuesMapProduct;

    @Autowired
    private Environment environment; 

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
    
    @GetMapping("/values")
    public Map<String, Object> getConfigValues() {
        Map<String, Object> json = new HashMap<>() ;
        json.put("code", code);
        json.put("usename", name);
        json.put("list", list);
        json.put("message", message);
        json.put("specialCharacters", specialCharacters);
        json.put("listUpperCase", listUpper);
        json.put("items", valuesMap);
        json.put("itemsPrice", valuesMapPrice);
        json.put("itemsProduct", valuesMapProduct);
        json.put("codeEnv", environment.getProperty("config.code", Long.class));
        return json;
    }
    
    
}

package com.hassan.springboot.webapp.springboot_webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home(){
        //Refreshes page, URL and parameters are lost with this new request
        return "redirect:/list";
        //Doesn't refresh page or change URL and keeps parameters as this is 
        //kept within the same request
        // return "forward:/list";
    }
}

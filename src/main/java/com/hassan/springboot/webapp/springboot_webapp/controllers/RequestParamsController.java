package com.hassan.springboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hassan.springboot.webapp.springboot_webapp.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "World") String message){
        //Query example: http://localhost:8080/api/params/foo?message=My%20message
        ParamDto param = new ParamDto();
        param.setMessage(message);
        param.setCode(7);

        return param;
    }

    @GetMapping("/bar")
    public ParamDto bar(@RequestParam String message, @RequestParam Integer code) {
        //Query example: http://localhost:8080/api/params/bar?message=Hello&code=3
        ParamDto param = new ParamDto();
        param.setMessage(message);
        param.setCode(code);

        return param;
    }
    
    @GetMapping("/request")
    public ParamDto request(HttpServletRequest request ) {

        ParamDto param = new ParamDto();
        Integer code = 10;
        try {
            code = Integer.parseInt(request.getParameter("code"));

        } catch (NumberFormatException e) {    
            System.err.println("Invalid number format for 'code': " + request.getParameter("code"));
        }
        param.setCode(code);
        param.setMessage(request.getParameter("message"));

        return param;
    }
    
}

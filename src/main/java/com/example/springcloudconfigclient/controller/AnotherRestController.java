package com.example.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherRestController {

    @Value("${message:Hello Default}")
    private String message;

    @Value("${user.role:Default Role}")
    private String role;

    @RequestMapping("/message")
    public String getMessage(){
        return this.message;
    }
    @RequestMapping(value = "/whoami/{username}", method = RequestMethod.GET)
    public String whoami(@PathVariable("username") String username){
        return "Hello !! , You are "+username+", You are "+role;
    }
}

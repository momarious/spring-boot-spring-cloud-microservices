package com.momarious.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // @Value("${message}")
	// private String message;    

    @GetMapping("/")
    public String home() {
        return "Welcome to the User service";
    }

    // @GetMapping("/message")
    // public String message() {
    //     return message;
    // }

}

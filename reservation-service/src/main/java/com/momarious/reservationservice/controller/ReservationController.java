package com.momarious.reservationservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
	
    // @Value("${message}")
	// private String message;    

    @GetMapping("/")
    public String home() {
        return "Welcome to the Reservation service";
    }

    // @GetMapping("/message")
    // public String message() {
    //     return message;
    // }

}

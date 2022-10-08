package com.momarious.userservice.entity;

import lombok.Data;

@Data
public class Address {

    private String streetAddress;
    private String city;
    private String country;
    private String zipCode;
    private String state;
}

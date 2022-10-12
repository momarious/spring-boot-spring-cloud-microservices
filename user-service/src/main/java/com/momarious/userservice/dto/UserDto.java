package com.momarious.userservice.dto;

import com.momarious.userservice.model.Address;
import com.momarious.userservice.model.User;

import lombok.Data;

@Data
public class UserDto {
    private String password;
    // private AccountStatus status;
    // private Role role;
    private String name;
    private String streetAddress;
    private String city;
    private String country;
    private String zipCode;
    private String state;
    private String email;
    private String phone;

    public Address getAddress() {
        return new Address(streetAddress, city, country, zipCode, state);
    }

    public User getUser() {
        return new User(city, password, null, null, name, getAddress(), email, phone);
    }

}

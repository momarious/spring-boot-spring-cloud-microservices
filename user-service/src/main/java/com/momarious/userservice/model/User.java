package com.momarious.userservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.momarious.userservice.model.enums.AccountStatus;
import com.momarious.userservice.model.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Document
@AllArgsConstructor
public class User {

    private String id;
    private String password;
    private AccountStatus status;
    private Role role;
    private String name;
    private Address address;
    private String email;
    private String phone;
}

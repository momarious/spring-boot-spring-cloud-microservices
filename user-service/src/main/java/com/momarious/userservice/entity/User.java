package com.momarious.userservice.entity;

import com.momarious.userservice.entity.enums.AccountStatus;
import com.momarious.userservice.entity.enums.Role;

import lombok.Data;

@Data
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

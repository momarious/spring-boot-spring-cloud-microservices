package com.momarious.userservice.entity;

import java.util.Date;

import lombok.Data;

@Data
public class LibraryCard {

    private String cardNumber;
    private Date issuedAt;
    private String barCode;
    private boolean isActive;

}

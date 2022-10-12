package com.momarious.userservice.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class LibraryCard {

    private String cardNumber;
    private Date issuedAt;
    private String barCode;
    private boolean isActive;

}

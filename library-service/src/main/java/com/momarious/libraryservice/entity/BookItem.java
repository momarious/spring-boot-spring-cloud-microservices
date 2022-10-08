package com.momarious.libraryservice.entity;

import java.util.Date;

import com.momarious.libraryservice.entity.enums.BookFormat;
import com.momarious.libraryservice.entity.enums.BookStatus;

public class BookItem extends Book {

    private String barcode;
    private boolean isReferenceOnly;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private BookFormat format;
    private BookStatus status;
    private Date dateOfPurchase;
    private Date publicationDate;
}

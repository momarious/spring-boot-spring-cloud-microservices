package com.momarious.libraryservice.model;

import java.util.Date;

import com.momarious.libraryservice.model.enums.BookFormat;
import com.momarious.libraryservice.model.enums.BookStatus;

public class BookItem {

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

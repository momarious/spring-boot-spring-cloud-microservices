package com.momarious.libraryservice.model;

import java.util.List;

// import org.springframework.data.mongodb.core.mapping.Document;

// @Document(collection = "book")
public class Book {

    private String ISBN;
    private String title;
    private String subject;
    private String publisher;
    private String language;
    private int numberOfPages;
    private List<Author> authors;
    private List<BookItem> items;

}

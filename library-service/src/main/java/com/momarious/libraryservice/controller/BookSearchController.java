package com.momarious.libraryservice.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController("search")
public class BookSearchController {

    public ResponseEntity<?> searchByTitle(String title) {
        return null;
    }

    public ResponseEntity<?> searchByAuthor(String author) {
        return null;
    }

    public ResponseEntity<?> searchBySubject(String subject) {
        return null;
    }

    public ResponseEntity<?> searchByPubDate(Date publishDate) {
        return null;

    }
}

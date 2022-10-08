package com.momarious.libraryservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.momarious.libraryservice.entity.Book;
import com.momarious.libraryservice.service.BookService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class BookController {

    public final BookService bookService;

    @PostMapping("books")
    public ResponseEntity<?> addBook(Book book) {
        try {
            return ResponseEntity.ok(bookService.addBook(book));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body(e.getMessage());
        }
    }

    @PutMapping("books/{id}")
    public ResponseEntity<?> addBook(String id, Book book) {
        try {
            return ResponseEntity.ok(bookService.editBook(id, book));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body(e.getMessage());
        }
    }

    @DeleteMapping("books/{id}")
    public ResponseEntity<?> removeBook(String id) {
        try {
            return ResponseEntity.ok(bookService.removeBook(id));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body(e.getMessage());
        }
    }
}

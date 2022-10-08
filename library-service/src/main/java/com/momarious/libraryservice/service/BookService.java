package com.momarious.libraryservice.service;

import org.springframework.stereotype.Service;

import com.momarious.libraryservice.entity.Book;
import com.momarious.libraryservice.repository.BookRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;

    public Book addBook(Book book) {
        return null;
    }

    public Object editBook(String id, Book book) {
        return null;
    }

    public Object removeBook(String id) {
        return null;
    }

}

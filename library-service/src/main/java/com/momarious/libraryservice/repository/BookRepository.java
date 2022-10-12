package com.momarious.libraryservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.momarious.libraryservice.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

}

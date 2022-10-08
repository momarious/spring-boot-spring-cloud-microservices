package com.momarious.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.momarious.userservice.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    
}

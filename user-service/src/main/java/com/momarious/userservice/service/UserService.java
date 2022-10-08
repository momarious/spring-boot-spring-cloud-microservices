package com.momarious.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.momarious.userservice.dto.LoginDto;
import com.momarious.userservice.entity.User;
import com.momarious.userservice.exceptions.ResourceNotFoundException;
import com.momarious.userservice.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User addUser(User u) {
        return userRepository.save(u);
    }

    public User updateUser(String id, User u) {
        User old = getUser(id);
        u.setId(old.getId());
        return u;
    }

    public String removeUser(String id) {
        User old = getUser(id);
        userRepository.delete(old);
        return "User deleted successfully";
    }

    public User getUser(String id) {
        return userRepository.findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("User", "id", id));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Object login(LoginDto dto) {
        return null;
    }

}

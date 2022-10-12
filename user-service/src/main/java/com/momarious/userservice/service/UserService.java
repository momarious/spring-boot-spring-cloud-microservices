package com.momarious.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.momarious.userservice.dto.LoginDto;
import com.momarious.userservice.dto.UserDto;
import com.momarious.userservice.exception.ResourceNotFoundException;
import com.momarious.userservice.model.User;
import com.momarious.userservice.model.enums.AccountStatus;
import com.momarious.userservice.model.enums.Role;
import com.momarious.userservice.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User addUser(UserDto dto) {
        User u = dto.getUser();
        u.setStatus(AccountStatus.CLOSED);
        u.setRole(Role.MEMBER);
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

    public String login(LoginDto dto) {
        return dto.getEmail() + " " + dto.getPassword();
    }

}

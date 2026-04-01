package com.example.faculty_credential_verification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.faculty_credential_verification.model.entity.User;
import com.example.faculty_credential_verification.repository.UserRepository;

@Service
public class AuthService {
    
    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        // Implement registration logic (e.g., check for existing user, hash password)
        return userRepository.save(user);
    }
    
}

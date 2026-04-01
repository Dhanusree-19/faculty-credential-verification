package com.example.faculty_credential_verification.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.faculty_credential_verification.model.dto.RegisterRequest;
import com.example.faculty_credential_verification.model.entity.User;
import com.example.faculty_credential_verification.repository.UserRepository;

@Service
public class AuthService {
    
    @Autowired
    private UserRepository userRepository;

    public void register(RegisterRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setRole("FACULTY");

        userRepository.save(user);
    }

    public User getUserByEmail(String email) {
         return userRepository.findByEmail(email)
        .orElseThrow(() -> new RuntimeException("User not found"));
}
}
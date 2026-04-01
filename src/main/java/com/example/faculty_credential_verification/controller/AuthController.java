package com.example.faculty_credential_verification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.faculty_credential_verification.model.dto.RegisterRequest;
import com.example.faculty_credential_verification.model.dto.RegisterResponse;
import com.example.faculty_credential_verification.model.entity.User;
import com.example.faculty_credential_verification.service.AuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/faculty-credential-verification")
public class AuthController {
    
    @Autowired
    private AuthService authService;

    //register user
    
    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request) {
        authService.register(request);
        RegisterResponse response = new RegisterResponse("User registered successfully");
        return ResponseEntity.ok(response);
    }

    // get user by email
    @GetMapping("/user")
    public ResponseEntity<RegisterResponse> getUserByEmail(@RequestParam String email) {
        User user = authService.getUserByEmail(email);
        RegisterResponse response = new RegisterResponse("User found: " + user.getName());
        return ResponseEntity.ok(response);
    }

}

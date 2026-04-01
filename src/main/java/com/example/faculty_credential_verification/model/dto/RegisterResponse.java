package com.example.faculty_credential_verification.model.dto;

public class RegisterResponse {

    private String message;

    public RegisterResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
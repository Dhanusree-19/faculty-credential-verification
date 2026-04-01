package com.example.faculty_credential_verification.model.dto;

import lombok.Data;

@Data
public class UserResponse {
    private String name;
    private String email;
    private String role;
}

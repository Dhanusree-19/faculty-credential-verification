package com.example.faculty_credential_verification.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class users {
    
    @Id
    @GeneratedValue
    Long id;
    String name;
    String email;
    String password;
    String role;
}

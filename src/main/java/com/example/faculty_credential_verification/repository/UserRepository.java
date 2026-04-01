package com.example.faculty_credential_verification.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.faculty_credential_verification.model.entity.User;

public class UserRepository {
    public interface userRepository extends JpaRepository<User, Long> {
        
    }
}

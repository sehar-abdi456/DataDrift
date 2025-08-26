// UserRepository.java
package com.example.datadrift.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.datadrift.backend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
    User findByUsername(String username);
}
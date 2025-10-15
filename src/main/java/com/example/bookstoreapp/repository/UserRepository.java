package com.example.bookstoreapp.repository;

import com.example.bookstoreapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
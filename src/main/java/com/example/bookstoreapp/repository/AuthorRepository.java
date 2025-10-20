package com.example.bookstoreapp.repository;

import com.example.bookstoreapp.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findByName(String name); // Returns exactly one author (or none).
    List<Author> findByNameContainingIgnoreCase(String name); // Returns multiple authors, even if names are partially matched.
}

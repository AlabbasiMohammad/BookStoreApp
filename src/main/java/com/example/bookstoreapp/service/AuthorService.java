package com.example.bookstoreapp.service;

import com.example.bookstoreapp.model.Author;
import com.example.bookstoreapp.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    // 🔹 Get all authors
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    // 🔹 Get author by ID
    public Optional<Author> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    // 🔹 Create new author
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    // 🔹 Update author
    public Author updateAuthor(Long id, Author updatedAuthor) {
        return authorRepository.findById(id)
                .map(existing -> {
                    existing.setName(updatedAuthor.getName());
                    existing.setBiography(updatedAuthor.getBiography());
                    existing.setBirthDate(updatedAuthor.getBirthDate());
                    existing.setNationality(updatedAuthor.getNationality());
                    existing.setPhotoUrl(updatedAuthor.getPhotoUrl());
                    return authorRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Author not found"));
    }

    // 🔹 Delete author
    public void deleteAuthor(Long id) {
        if (!authorRepository.existsById(id)) {
            throw new RuntimeException("Author not found");
        }
        authorRepository.deleteById(id);
    }

    // 🔹 Optional: Search authors by name
    public List<Author> searchByName(String name) {
        return authorRepository.findByNameContainingIgnoreCase(name);
    }

}

package com.example.bookstoreapp.controller;

import com.example.bookstoreapp.model.Author;
import com.example.bookstoreapp.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/api"})
@CrossOrigin(value = {"http://localhost:3000"})
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    // 1. Get all authors
    @GetMapping("/authors")
    public List<Author> getAllAuthors(@RequestParam(required = false) String search) {
        if (search != null && !search.isEmpty()) {
            return authorService.searchByName(search);
        }
        return authorService.getAllAuthors();
    }

    // 2. Get a single author by ID
    @GetMapping("/author/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // 3. Create a new author
    @PostMapping("/author")
    public Author createAuthor(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }

    // 4. Update an existing author
    @PutMapping("/author/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable Long id, @RequestBody Author authorDetails) {
        return authorService.getAuthorById(id)
                .map(existingAuthor -> {
                    existingAuthor.setName(authorDetails.getName());
                    existingAuthor.setBiography(authorDetails.getBiography());
                    existingAuthor.setBirthDate(authorDetails.getBirthDate());
                    Author updatedAuthor = authorService.createAuthor(existingAuthor);
                    return ResponseEntity.ok(updatedAuthor);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // 5. Delete an author
    @DeleteMapping("/author/{id}")
    public ResponseEntity<Void> deleteAuthor(@PathVariable Long id) {
        if (authorService.getAuthorById(id).isPresent()) {
            authorService.deleteAuthor(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

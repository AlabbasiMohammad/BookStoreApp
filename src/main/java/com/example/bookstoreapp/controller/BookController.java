package com.example.bookstoreapp.controller;

import com.example.bookstoreapp.model.Book;
import org.springframework.web.bind.annotation.*;
import com.example.bookstoreapp.repository.BookRepository;

import java.util.List;

@RestController
@RequestMapping(value = {"/api"})
@CrossOrigin(value = {"http://localhost:3000"})
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }



    @GetMapping("/books")
    List<Book> getAll()
    {
        return bookRepository.findAll();
    }

    @PostMapping("/book")
    Book addBook(@RequestBody Book book)
    {
        return bookRepository.save(book);
    }


}

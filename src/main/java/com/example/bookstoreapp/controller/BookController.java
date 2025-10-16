package com.example.bookstoreapp.controller;

import com.example.bookstoreapp.model.Book;
import com.example.bookstoreapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/api"})
@CrossOrigin(value = {"http://localhost:3000"})
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    List<Book> getAll()
    {
        return bookService.getAllBooks();
    }

    @PostMapping("/book")
    Book addBook(@RequestBody Book book)
    {
        return bookService.addBook(book);
    }


}

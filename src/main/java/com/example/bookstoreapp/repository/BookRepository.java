package com.example.bookstoreapp.repository;

import com.example.bookstoreapp.model.Author;
import com.example.bookstoreapp.model.Book;
import com.example.bookstoreapp.model.Category;
import com.example.bookstoreapp.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByGenre(Genre genre);
    List<Book> findByCategory(Category category);
    List<Book> findByAuthor(Author author);
}

package com.example.bookstoreapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "review")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Optional: The user who wrote the review
    private String reviewerName;

    // A short title or summary of the review
    private String title;

    // The main review text
    @Column(length = 2000)
    private String content;

    // Star rating (1–5 for example)
    private int rating;

    // When the review was created
    private LocalDateTime createdAt;

    // Automatically set timestamp before persisting
    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @ManyToOne
    private Book book;
}

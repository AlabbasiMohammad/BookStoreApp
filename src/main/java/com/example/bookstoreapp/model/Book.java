package com.example.bookstoreapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "books")
@Data @NoArgsConstructor @AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //    @Id
//    @GeneratedValue
//    private Long isbn;
    private String title;
    private Date published_date;
    private Integer pages;
    private String language;
    @Column(length = 2000)
    private String description;
    private Integer price;
    private Integer stock;
    private String image;
    private String cover_image;


    @ManyToOne
    private Author author;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Genre genre;

    @ManyToOne
    private Publisher publisher;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Review> reviews;

}

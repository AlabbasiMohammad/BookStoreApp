package com.example.bookstoreapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Service;

import java.util.Date;

@Entity
@Table(name = "books_test")
public class Book {
    @Id
    private int id;
    //    @Id
//    @GeneratedValue
//    private Long isbn;
    private String title;
    private Date published_date;
    private Integer pages;
    private String language;
    private String description;
    private String author;
    private int price;
    private int stock;
    private String image;
    private String cover_image;

    public String getImage() {return image;}

    public void setImage(String image) {this.image = image;}

    public int getStock() {return stock;}

    public void setStock(int stock) {this.stock = stock;}

    public int getPrice() {return price;}

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Book() {
    }

//    public void setIsbn(Long isbn) {
//        this.isbn = isbn;
//    }
//
//    public Long getIsbn() {
//        return isbn;
//    }


    public int getId() {return id;}

    public void setId(int id) { this.id = id;}

    public String getAuthor() { return author;}
    public void setAuthor(String author) {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getpublished_date() {
        return published_date;
    }

    public void setpublished_date(Date published_date) {
        this.published_date = published_date;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCover_image() {
        return cover_image;
    }
    public void setCover_image(String cover_image) {}
}

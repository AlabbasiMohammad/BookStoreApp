package com.example.bookstoreapp.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "author")
public class Author {


    @Id
    private Long author_id;
    private String name;
    private Date date_of_birth;
    private String email;





    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setAuthor_id(Long authorId) {
        this.author_id = authorId;
    }

    public Long getAuthor_id() {
        return author_id;
    }
}

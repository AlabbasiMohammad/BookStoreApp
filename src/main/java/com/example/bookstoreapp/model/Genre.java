package com.example.bookstoreapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre {
    @Id
    private Long genre_id;

    private String name;


    public Genre() {
    }

    public void setGenre_id(Long genreId) {
        this.genre_id = genreId;
    }

    public Long getGenre_id() {
        return genre_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.bookstoreapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    @Id
    private Long code;

    private String name;



    public Country() {
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Long getCode() {
        return code;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.bookstoreapp.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "users")
public class User {

    private String username;
    private LocalDate dob;
    private String email;
    private int age;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
        this.age = Period.between(dob, LocalDate.now()).getYears();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        // this.dob = LocalDate.now().minus(Period.ofYears(age));
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

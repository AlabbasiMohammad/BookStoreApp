package com.example.bookstoreapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookStoreAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BookStoreAppApplication.class, args);
    }

}

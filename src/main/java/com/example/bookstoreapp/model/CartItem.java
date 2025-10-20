package com.example.bookstoreapp.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    private Cart cart;
//
//    @ManyToOne
//    private Book book;

    private Integer quantity;
    private Double priceAtTime;
}

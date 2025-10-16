package com.example.bookstoreapp.model;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentMethod;
    private String status;
    private String transactionId;
    private LocalDateTime paidAt;

    @OneToOne
    private Order order;
}
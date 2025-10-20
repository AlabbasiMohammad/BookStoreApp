package com.example.bookstoreapp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "country")
@Data @NoArgsConstructor @AllArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    private String name;

//    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
//    private List<Address> addresses;
}

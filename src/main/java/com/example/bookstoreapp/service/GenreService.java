package com.example.bookstoreapp.service;

import com.example.bookstoreapp.model.Genre;
import com.example.bookstoreapp.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GenreService {
    private  final GenreRepository _genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this._genreRepository = genreRepository;
    }


    public List<Genre> findAll(){
        return _genreRepository.findAll();
    }

}

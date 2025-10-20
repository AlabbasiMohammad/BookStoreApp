package com.example.bookstoreapp.service;

import com.example.bookstoreapp.model.Publisher;
import com.example.bookstoreapp.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PublisherService {

    private PublisherRepository publisherRepository;

    @Autowired
    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }


    public List<Publisher> findAll() {
        return publisherRepository.findAll();
    }
}

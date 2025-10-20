package com.example.bookstoreapp.controller;

import com.example.bookstoreapp.model.Publisher;
import com.example.bookstoreapp.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/api"})
@CrossOrigin(value = {"http://localhost:3000"})
public class PublisherController {
    private final PublisherService _publisherService;

    @Autowired
    public PublisherController(PublisherService publisherService) {
        this._publisherService = publisherService;
    }


    @GetMapping("/publishers")
    public List<Publisher> findAll() {
        return _publisherService.findAll();
    }
}

package com.example.bookstoreapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/about"})
public class AboutController {


    @GetMapping(value = {"", "/"})
    public String aboutApp()
    {
        return "about app.";
    }

}

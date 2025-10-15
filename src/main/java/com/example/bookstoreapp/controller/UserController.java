package com.example.bookstoreapp.controller;


import com.example.bookstoreapp.exception.UserNotFoundException;
import com.example.bookstoreapp.model.User;
import com.example.bookstoreapp.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/api"})
@CrossOrigin(value = {"http://localhost:3000"})
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @PostMapping("/user")
    User addUser(@RequestBody User user)
    {
        return userRepository.save(user);
    }


    @GetMapping("/users")
    List<User> getAll()
    {
        return userRepository.findAll();
    }


    @GetMapping(value = {"/user/{id}"})
    User getUserByID(@PathVariable Long id)
    {
        return userRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));
    }

    @PutMapping(value = {"/user/{id}"})
    User updateUser(@RequestBody User newUser, @PathVariable Long id)
    {
        return userRepository.findById(id)
                .map(user ->  {
                    user.setUsername(newUser.getUsername());
                    user.setEmail(newUser.getEmail());
                    user.setDob(newUser.getDob());
                    // user.setAge(newUser.getAge());
                    return userRepository.save(user);
                }).orElseGet(()->{
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });
    }



    @DeleteMapping(value = {"/user/{id}"})
    String deleteUser(@PathVariable Long id)
    {
        if (!userRepository.existsById(id)) throw new UserNotFoundException(id);
        userRepository.deleteById(id);
        return "User with id " + id + "has been deleted successfully.";
    }


    @DeleteMapping(value = {"/users"})
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }


}

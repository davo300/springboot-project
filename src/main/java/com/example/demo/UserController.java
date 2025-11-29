package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return repo.findAll();
    }

    @PostMapping("/users")
    public User create(@RequestBody User user) {
        return repo.save(user);
    }
}

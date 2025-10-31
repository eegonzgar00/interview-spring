package com.example.starter.infrastructure.adapter.web;

import com.example.starter.domain.model.User;
import com.example.starter.application.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Controlador REST para manejar operaciones sobre usuarios.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService svc;

    public UserController(UserService svc) {
        this.svc = svc;
    }

    @GetMapping
    public List<User> list() {
        return svc.listUsers();
    }

    @PostMapping
    public ResponseEntity<User> create(@Validated @RequestBody User u) {
        User saved = svc.saveUser(u);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        return svc.getUser(id);
    }
}


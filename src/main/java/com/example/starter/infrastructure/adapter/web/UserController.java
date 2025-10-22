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

    /** GET /api/users - Lista todos los usuarios */
    @GetMapping
    public List<User> list() {
        return svc.list();
    }

    /** POST /api/users - Crea un nuevo usuario */
    @PostMapping
    public ResponseEntity<User> create(@Validated @RequestBody User u) {
        User saved = svc.create(u);
        return ResponseEntity.ok(saved);
    }

    /** GET /api/users/{id} - Obtiene un usuario por ID */
    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        return svc.get(id);
    }
}

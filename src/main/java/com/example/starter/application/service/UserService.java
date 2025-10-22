package com.example.starter.application.service;

import com.example.starter.domain.model.User;
import com.example.starter.domain.port.UserRepositoryPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Caso de uso principal para manejar usuarios.
 * Depende solo de un puerto (interfaz), no de JPA ni de Spring Web.
 */
@Service
public class UserService {

    private final UserRepositoryPort repo;

    public UserService(UserRepositoryPort repo) {
        this.repo = repo;
    }

    public User create(User user) {
        return repo.save(user);
    }

    public List<User> list() {
        return repo.findAll();
    }

    public User get(Long id) {
        return repo.findById(id).orElseThrow();
    }
}
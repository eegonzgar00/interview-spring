package com.example.starter.infrastructure.adapter.persistence;


import com.example.starter.domain.model.User;
import com.example.starter.domain.port.UserRepositoryPort;
import com.example.starter.infrastructure.repository.SpringDataUserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Adaptador que implementa el puerto usando JPA (infraestructura).
 */
@Component
public class UserJpaAdapter implements UserRepositoryPort {

    private final SpringDataUserRepository repo;

    public UserJpaAdapter(SpringDataUserRepository repo) {
        this.repo = repo;
    }

    @Override
    public User save(User user) {
        return repo.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<User> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return repo.findByUsername(username);
    }
}
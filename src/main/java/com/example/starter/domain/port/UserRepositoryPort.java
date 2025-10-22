package com.example.starter.domain.port;

import com.example.starter.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Puerto de persistencia para el dominio User.
 * Define las operaciones necesarias sin depender de una implementación concreta.
 */
public interface UserRepositoryPort {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    Optional<User> findByUsername(String username);
}
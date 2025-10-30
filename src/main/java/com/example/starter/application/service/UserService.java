package com.example.starter.application.service;

import com.example.starter.domain.model.User;
import com.example.starter.domain.port.UserRepositoryPort;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Caso de uso principal para manejar usuarios.
 * Depende solo de un puerto (interfaz), no de JPA ni de Spring Web.
 */
@Service
@Transactional
public class UserService {

    private final UserRepositoryPort repo;

    public UserService(UserRepositoryPort repo) {
        this.repo = repo;
    }

    /** Obtiene un usuario y lo guarda en caché */
    @Cacheable(value = "users", key = "#id")
    public User getUser(Long id) {
        return repo.findById(id).orElseThrow();
    }

    /** Lista todos los usuarios, con caché */
    @Cacheable("allUsers")
    public List<User> listUsers() {
        return repo.findAll();
    }

    /** Guarda un usuario y limpia la caché */
    @CacheEvict(value = { "users", "allUsers" }, allEntries = true)
    public User saveUser(User user) {
        return repo.save(user);
    }

    /** Elimina un usuario y limpia la caché */
    @CacheEvict(value = { "users", "allUsers" }, allEntries = true)
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}
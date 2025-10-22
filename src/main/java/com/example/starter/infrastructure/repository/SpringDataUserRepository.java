package com.example.starter.infrastructure.repository;

import com.example.starter.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repositorio Spring Data JPA.
 * Implementa automáticamente consultas CRUD y personalizadas.
 * Es usado por el adaptador JPA (UserJpaAdapter).
 */
@Repository
public interface SpringDataUserRepository extends JpaRepository<User, Long> {

    /**
     * Busca un usuario por su nombre de usuario.
     * @param username nombre de usuario
     * @return un Optional con el usuario si existe
     */
    Optional<User> findByUsername(String username);
}
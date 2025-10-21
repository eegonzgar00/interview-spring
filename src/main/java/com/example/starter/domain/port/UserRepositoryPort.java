package com.example.starter.repository;

import com.example.starter.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * Repositorio JPA para la entidad User.
 * JpaRepository proporciona métodos CRUD automáticamente.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Busca un usuario por su nombre de usuario.
     * @param username Nombre de usuario a buscar.
     * @return Optional<User> si se encuentra.
     */
    Optional<User> findByUsername(String username);
}

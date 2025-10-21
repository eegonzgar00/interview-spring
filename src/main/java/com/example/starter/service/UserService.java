package com.example.starter.service;

import com.example.starter.domain.model.User;
import com.example.starter.domain.port.UserRepositoryPort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Servicio para manejar la lógica de negocio de User.
 */
@Service
@Transactional
public class UserService {

    private final UserRepositoryPort repo;

    public UserService(UserRepositoryPort repo) {
        this.repo = repo;
    }

    /**
     * Crea un nuevo usuario.
     * @param u Usuario a crear.
     * @return Usuario creado.
     */
    public User create(User u) {
        return repo.save(u);
    }

    /**
     * Lista todos los usuarios.
     * @return Lista de usuarios.
     */
    public List<User> list() {
        return repo.findAll();
    }

    /**
     * Obtiene un usuario por su ID.
     * @param id ID del usuario.
     * @return Usuario encontrado.
     * @throws java.util.NoSuchElementException si no se encuentra.
     */
    public User get(Long id) {
        return repo.findById(id).orElseThrow();
    }
}

package com.example.starter.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

/**
 * Representa un usuario en la aplicación.
 */
@Entity
@Table(name = "users")
@Data              // Genera getters, setters, toString, equals, hashCode
@NoArgsConstructor // Constructor sin argumentos
@AllArgsConstructor // Constructor con todos los argumentos
@Builder           // Permite construir objetos usando el patrón Builder
public class User {

    /** Identificador único del usuario */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Nombre de usuario, obligatorio */
    @NotBlank
    private String username;

    /** Contraseña del usuario, obligatoria */
    @NotBlank
    private String password;

    /** Correo electrónico del usuario, debe ser válido */
    @Email
    private String email;
}

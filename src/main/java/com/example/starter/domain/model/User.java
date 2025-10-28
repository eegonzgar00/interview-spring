package com.example.starter.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

/**
 * Entidad de dominio User con soporte de auditoría.
 */
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @Email
    private String email;

    /** Fecha de creación del registro */
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    /** Fecha de última modificación */
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
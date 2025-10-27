package com.example.starter.application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Representa los datos necesarios para crear un usuario (entrada del API).
 */
@Data
public class UserRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @Email
    private String email;
}
package com.example.starter.application.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Representa la respuesta devuelta al cliente.
 */
@Data
@Builder
public class UserResponse {
    private Long id;
    private String username;
    private String email;
}
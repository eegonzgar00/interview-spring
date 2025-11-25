package com.example.starter.application.mapper;

import com.example.starter.application.dto.request.UserRequest;
import com.example.starter.application.dto.UserResponse;
import com.example.starter.domain.model.User;
import org.springframework.stereotype.Component;

/**
 * Convierte entre entidad User y sus DTOs.
 */
@Component
public class UserMapper {

    public User toEntity(UserRequest req) {
        return User.builder()
                .username(req.getUsername())
                .password(req.getPassword())
                .email(req.getEmail())
                .build();
    }

    public UserResponse toResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }
}
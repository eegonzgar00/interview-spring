package com.example.starter.application.service;

import com.example.starter.application.dto.request.UserRequest;
import com.example.starter.domain.model.Role;
import com.example.starter.domain.model.User;
import com.example.starter.domain.port.UserRepositoryPort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepositoryPort userRepo;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepositoryPort userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    public User register(UserRequest req) {
        User u = User.builder()
                .username(req.getUsername())
                .password(passwordEncoder.encode(req.getPassword()))
                .email(req.getEmail())
                .role(Role.USER)
                .build();
        return userRepo.save(u);
    }
}

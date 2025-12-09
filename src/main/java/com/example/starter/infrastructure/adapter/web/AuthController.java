package com.example.starter.infrastructure.adapter.web;

import com.example.starter.application.dto.request.LoginRequest;
import com.example.starter.application.dto.request.UserRequest;
import com.example.starter.application.dto.response.AuthResponse;
import com.example.starter.application.dto.response.UserResponse;
import com.example.starter.application.service.AuthService;
import com.example.starter.domain.model.User;
import com.example.starter.infrastructure.repository.SpringDataUserRepository;
import com.example.starter.infrastructure.security.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    private final AuthenticationManager authManager;
    private final JwtUtil jwtUtil;
    private final SpringDataUserRepository userRepo;

    public AuthController(AuthService authService, AuthenticationManager authManager, JwtUtil jwtUtil, SpringDataUserRepository userRepo) {
        this.authService = authService;
        this.authManager = authManager;
        this.jwtUtil = jwtUtil;
        this.userRepo = userRepo;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Validated @RequestBody UserRequest req) {
        // podrías verificar existencia de username/email
        User saved = authService.register(req);
        return ResponseEntity.ok(UserResponse.builder()
                .id(saved.getId())
                .username(saved.getUsername())
                .email(saved.getEmail())
                .role(saved.getRole().name())
                .build());
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@Validated @RequestBody LoginRequest req) {
        Authentication a = authManager.authenticate(new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword()));
        // si no lanza excepción, autenticación OK
        String token = jwtUtil.generateToken(req.getUsername());
        return ResponseEntity.ok(new AuthResponse(token));
    }
}


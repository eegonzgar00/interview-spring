package com.example.starter.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Define quién es el auditor actual (quién creó o modificó un registro).
 * Más adelante puedes vincularlo con Spring Security para obtener el usuario autenticado.
 */
@Component("auditorAware")
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Temporalmente devolvemos un nombre fijo
        return Optional.of("system-user");
    }
}
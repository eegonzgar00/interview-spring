package com.example.starter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Habilita la auditoría JPA en el proyecto.
 * Esto permite que los campos @CreatedDate y @LastModifiedDate
 * se llenen automáticamente.
 */
@Configuration
@EnableJpaAuditing
public class JpaAuditingConfig {
}

package com.example.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Clase principal de la aplicación Spring Boot.
 *
 * @SpringBootApplication combina:
 * - @Configuration: indica que esta clase puede contener beans.
 * - @EnableAutoConfiguration: configura automáticamente Spring según las dependencias.
 * - @ComponentScan: busca automáticamente beans, controladores y servicios en el paquete.
 */
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableCaching
public class StarterApplication {
    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class, args);
    }
}

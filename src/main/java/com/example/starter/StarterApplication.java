package com.example.starter;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.PrintStream;

import java.io.PrintStream;

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
        SpringApplication app = new SpringApplication(StarterApplication.class);

        // Banner personalizado por código
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                out.println("🚀 Bienvenido a tu aplicación Starter con Spring Boot!");
                out.println("Versión de Spring Boot: " + environment.getProperty("spring.boot.version"));
            }
        });

        app.run(args);

    }
}

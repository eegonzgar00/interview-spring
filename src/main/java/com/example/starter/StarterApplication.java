package com.example.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación Spring Boot.
 *
 * @SpringBootApplication combina:
 * - @Configuration: indica que esta clase puede contener beans.
 * - @EnableAutoConfiguration: configura automáticamente Spring según las dependencias.
 * - @ComponentScan: busca automáticamente beans, controladores y servicios en el paquete.
 */
@SpringBootApplication
public class StarterApplication {
    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class, args);
    }
}

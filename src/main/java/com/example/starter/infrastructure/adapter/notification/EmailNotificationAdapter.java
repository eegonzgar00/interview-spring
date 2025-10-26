package com.example.starter.infrastructure.adapter.notification;

import com.example.starter.domain.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Implementación simple que simula el envío de correos.
 */
@Component
public class EmailNotificationAdapter implements NotificationPort {

    private static final Logger log = LoggerFactory.getLogger(EmailNotificationAdapter.class);

    @Override
    public void sendWelcomeEmail(User user) {
        log.info("📧 Enviando correo de bienvenida a {}", user.getEmail());
    }
}
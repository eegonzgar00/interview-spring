package com.example.starter.domain.port;

import com.example.starter.domain.model.User;

public interface NotificationPort {
    void sendWelcomeEmail(User user);
}

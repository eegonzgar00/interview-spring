package com.example.starter.domain.event;


import com.example.starter.domain.model.User;
import org.springframework.context.ApplicationEvent;

/**
 * Evento lanzado cuando se crea un nuevo usuario.
 */
public class UserCreatedEvent extends ApplicationEvent {
    public UserCreatedEvent(User user) {
        super(user);
    }

    public User getUser() {
        return (User) getSource();
    }
}

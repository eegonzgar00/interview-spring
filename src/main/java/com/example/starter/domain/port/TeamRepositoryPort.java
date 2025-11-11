package com.example.starter.domain.port;

import com.example.starter.domain.model.Team;

import java.util.List;
import java.util.Optional;

public interface TeamRepositoryPort {
    List<Team> findAll();
    Optional<Team> findById(Long id);
    Team save(Team team);
}
package com.example.starter.domain.port;

import com.example.starter.domain.model.Tournament;

import java.util.List;
import java.util.Optional;

public interface TournamentRepositoryPort {
    List<Tournament> findAll();
    Optional<Tournament> findById(Long id);
    Tournament save(Tournament tournament);
}

package com.example.starter.application.service;

import com.example.starter.domain.model.Tournament;
import com.example.starter.domain.port.TournamentRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentService {
    private final TournamentRepositoryPort repo;

    public TournamentService(TournamentRepositoryPort repo) {
        this.repo = repo;
    }

    public List<Tournament> listTournaments() { return repo.findAll(); }

    public Tournament saveTournament(Tournament tournament) { return repo.save(tournament); }
}

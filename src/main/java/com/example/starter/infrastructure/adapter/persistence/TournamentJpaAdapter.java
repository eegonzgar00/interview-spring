package com.example.starter.infrastructure.adapter.persistence;

import com.example.starter.domain.model.Tournament;
import com.example.starter.domain.port.TournamentRepositoryPort;
import com.example.starter.infrastructure.repository.SpringDataTournamentRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TournamentJpaAdapter implements TournamentRepositoryPort {
    private final SpringDataTournamentRepository repo;
    public TournamentJpaAdapter(SpringDataTournamentRepository repo) { this.repo = repo; }

    public List<Tournament> findAll() { return repo.findAll(); }
    public Optional<Tournament> findById(Long id) { return repo.findById(id); }
    public Tournament save(Tournament t) { return repo.save(t); }
}

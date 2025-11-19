package com.example.starter.infrastructure.adapter.persistence;


import com.example.starter.domain.model.Team;
import com.example.starter.domain.port.TeamRepositoryPort;
import com.example.starter.infrastructure.repository.SpringDataTeamRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TeamJpaAdapter implements TeamRepositoryPort {
    private final SpringDataTeamRepository repo;
    public TeamJpaAdapter(SpringDataTeamRepository repo) { this.repo = repo; }

    public List<Team> findAll() { return repo.findAll(); }
    public Optional<Team> findById(Long id) { return repo.findById(id); }
    public Team save(Team team) { return repo.save(team); }
}


package com.example.starter.application.service;

import com.example.starter.domain.model.Team;
import com.example.starter.domain.port.TeamRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private final TeamRepositoryPort repo;

    public TeamService(TeamRepositoryPort repo) {
        this.repo = repo;
    }

    public List<Team> listTeams() { return repo.findAll(); }

    public Team saveTeam(Team team) { return repo.save(team); }
}

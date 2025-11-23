package com.example.starter.infrastructure.adapter.web;

import com.example.starter.application.service.TeamService;
import com.example.starter.domain.model.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
class TeamController {
    private final TeamService service;
    public TeamController(TeamService service) { this.service = service; }

    @GetMapping
    public List<Team> list() { return service.listTeams(); }
    @PostMapping
    public ResponseEntity<Team> create(@RequestBody Team t) { return ResponseEntity.ok(service.saveTeam(t)); }
}

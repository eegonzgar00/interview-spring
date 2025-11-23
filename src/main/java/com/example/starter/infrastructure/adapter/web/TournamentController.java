package com.example.starter.infrastructure.adapter.web;

import com.example.starter.application.service.TournamentService;
import com.example.starter.domain.model.Tournament;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tournaments")
class TournamentController {
    private final TournamentService service;
    public TournamentController(TournamentService service) { this.service = service; }

    @GetMapping
    public List<Tournament> list() { return service.listTournaments(); }
    @PostMapping
    public ResponseEntity<Tournament> create(@RequestBody Tournament t) { return ResponseEntity.ok(service.saveTournament(t)); }
}
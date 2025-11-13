package com.example.starter.infrastructure.repository;

import com.example.starter.domain.model.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataTournamentRepository extends JpaRepository<Tournament, Long> { }


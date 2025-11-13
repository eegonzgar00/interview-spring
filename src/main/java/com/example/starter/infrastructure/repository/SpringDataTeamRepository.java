package com.example.starter.infrastructure.repository;


import com.example.starter.domain.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataTeamRepository extends JpaRepository<Team, Long> { }

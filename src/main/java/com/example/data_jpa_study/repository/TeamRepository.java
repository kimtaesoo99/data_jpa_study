package com.example.data_jpa_study.repository;

import com.example.data_jpa_study.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {
}

package com.devsuperior.dsmovie.domain.repositories;

import com.devsuperior.dsmovie.domain.model.Score;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {

}

package com.devsuperior.dsmovie.domain.repositories;

import com.devsuperior.dsmovie.domain.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

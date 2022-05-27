package com.devsuperior.dsmovie.domain.services;

import java.util.List;
import java.util.Optional;

import com.devsuperior.dsmovie.api.dto.MovieDTO;
import com.devsuperior.dsmovie.domain.model.Movie;
import com.devsuperior.dsmovie.domain.repositories.MovieRepository;
import com.devsuperior.dsmovie.domain.util.ObjectMapperUtils;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MovieService {

    private MovieRepository movieRepository;
    private ObjectMapperUtils objectMapperUtils;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        return objectMapperUtils.mapEntityPageIntoDtoPage(movieRepository.findAll(pageable), MovieDTO.class);
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isPresent())
            return objectMapperUtils.map(movie.get(), MovieDTO.class);
        else
            return null;
    }

}

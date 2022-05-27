package com.devsuperior.dsmovie.api.controller;

import com.devsuperior.dsmovie.api.dto.MovieDTO;
import com.devsuperior.dsmovie.api.dto.ScoreDTO;
import com.devsuperior.dsmovie.domain.repositories.MovieRepository;
import com.devsuperior.dsmovie.domain.services.MovieService;
import com.devsuperior.dsmovie.domain.services.ScoreService;
import com.devsuperior.dsmovie.domain.util.ObjectMapperUtils;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    private ScoreService scoreService;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO scoreDTO) {
        return scoreService.saveScore(scoreDTO);
    }

}

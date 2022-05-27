package com.devsuperior.dsmovie.domain.services;

import java.util.Optional;

import com.devsuperior.dsmovie.api.dto.MovieDTO;
import com.devsuperior.dsmovie.api.dto.ScoreDTO;
import com.devsuperior.dsmovie.domain.model.Movie;
import com.devsuperior.dsmovie.domain.model.Score;
import com.devsuperior.dsmovie.domain.model.User;
import com.devsuperior.dsmovie.domain.repositories.MovieRepository;
import com.devsuperior.dsmovie.domain.repositories.ScoreRepository;
import com.devsuperior.dsmovie.domain.repositories.UserRepository;
import com.devsuperior.dsmovie.domain.util.ObjectMapperUtils;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ScoreService {

    private MovieRepository movieRepository;
    private UserRepository userRepository;
    private ScoreRepository scoreRepository;
    private ObjectMapperUtils objectMapperUtils;

    @Transactional
    public MovieDTO saveScore(ScoreDTO scoreDTO) {

        Score score = new Score();

        Optional<User> user = userRepository.findByEmail(scoreDTO.getEmail());

        if (user.isPresent()) {
            score.setUser(user.get());
        } else {
            User userNew = new User();
            userNew.setEmail(scoreDTO.getEmail());
            score.setUser(userRepository.saveAndFlush(userNew));
        }

        Movie movie = movieRepository.findById(scoreDTO.getMovieId()).get();

        score.setMovie(movie);
        score.setValue(scoreDTO.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;
        for (Score scoreMovie : movie.getScores()) {
            sum = sum + scoreMovie.getValue();
        }

        double avg = sum / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        return (objectMapperUtils.map(movieRepository.save(movie), MovieDTO.class));
    }

}

package com.devsuperior.dsmovie.domain.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class ScorePK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Movie movie;

}

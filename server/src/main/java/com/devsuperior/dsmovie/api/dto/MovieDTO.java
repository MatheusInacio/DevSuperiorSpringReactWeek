package com.devsuperior.dsmovie.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDTO {

    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

}

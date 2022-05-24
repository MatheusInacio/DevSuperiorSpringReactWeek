package com.devsuperior.dsmovie.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MovieDTO {

    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

}

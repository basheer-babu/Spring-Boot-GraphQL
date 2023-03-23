package com.dpoiont.graphql.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieCreateDto {
    private String movieName;

    private String leadActorName;

    private String Genre;

    private String producer;

    private Double imdbRating;
}

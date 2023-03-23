package com.dpoiont.graphql.service;

import com.dpoiont.graphql.dto.MovieCreateDto;
import com.dpoiont.graphql.model.Movie;

import java.util.List;

public interface MovieService {

    public List<Movie> fetchAllMovies();
    public Movie fetchMovie(String movieName);
    public Movie createMovie(MovieCreateDto movieCreateDto);

}

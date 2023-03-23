package com.dpoiont.graphql.controller;

import com.dpoiont.graphql.dto.MovieCreateDto;
import com.dpoiont.graphql.model.Movie;
import com.dpoiont.graphql.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping
    public List<Movie> fetchAllMovies() {
        return movieService.fetchAllMovies();
    }

    @GetMapping("/{moviename}")
    public Movie fetchMovie(@PathVariable String moviename) {
        return movieService.fetchMovie(moviename);
    }

    @PostMapping
    public Movie createMovie(@Argument MovieCreateDto moviecreaterequest) {
        return movieService.createMovie(moviecreaterequest);
    }
}

package com.dpoiont.graphql.controller;

import com.dpoiont.graphql.dto.MovieCreateDto;
import com.dpoiont.graphql.model.Movie;
import com.dpoiont.graphql.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

//@RestController
//@RequestMapping("/movie")
@Controller
public class MovieController {

    @Autowired
    MovieService movieService;

    //    @GetMapping
    @QueryMapping("fetchallMovie")
    public List<Movie> fetchAllMovies() {
        return movieService.fetchAllMovies();
    }

    //    @GetMapping("/{moviename}")
    @QueryMapping("fetchSpecificMovie")
//    public Movie fetchMovie(@PathVariable String moviename){
    public Movie fetchMovie(@Argument String moviename) {
        return movieService.fetchMovie(moviename);
    }

//    @PostMapping
    @MutationMapping("createMovie")
    public Movie createMovie(@Argument MovieCreateDto moviecreaterequest) {
        return movieService.createMovie(moviecreaterequest);
    }
}

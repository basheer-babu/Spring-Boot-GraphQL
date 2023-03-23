package com.dpoiont.graphql.service;

import com.dpoiont.graphql.dto.MovieCreateDto;
import com.dpoiont.graphql.model.Movie;
import com.dpoiont.graphql.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<Movie> fetchAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie fetchMovie(String movieName) {
        return movieRepository.findFirstMovieByMovieName(movieName);
    }

    @Override
    public Movie createMovie(MovieCreateDto movieCreateDto) {
        Movie movie = new Movie();
        movie.setMovieName(movieCreateDto.getMovieName());
        movie.setGenre(movieCreateDto.getGenre());
        movie.setProducer(movieCreateDto.getProducer());
        movie.setLeadActorName(movieCreateDto.getLeadActorName());
        movie.setImdbRating(movieCreateDto.getImdbRating());
        return movieRepository.save(movie);
    }
}

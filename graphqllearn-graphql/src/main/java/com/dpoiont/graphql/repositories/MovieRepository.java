package com.dpoiont.graphql.repositories;

import com.dpoiont.graphql.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {

    Movie findFirstMovieByMovieName(String movieName);
}

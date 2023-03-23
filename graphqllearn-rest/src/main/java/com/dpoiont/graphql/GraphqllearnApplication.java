package com.dpoiont.graphql;

import com.dpoiont.graphql.model.Movie;
import com.dpoiont.graphql.repositories.MovieRepository;
import com.dpoiont.graphql.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqllearnApplication implements CommandLineRunner {
	@Autowired
	MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(GraphqllearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Movie m1 = new Movie();
		m1.setMovieName("The Dark Knight");
		m1.setGenre("Action");
		m1.setProducer("Christopher Nolan");
		m1.setLeadActorName("Christian Bale");
		m1.setImdbRating(9.0);

		Movie m2 = new Movie();
		m2.setMovieName("Titanic");
		m2.setGenre("Drama");
		m2.setProducer("James Cameron");
		m2.setLeadActorName("Leonardo DiCaprio");
		m2.setImdbRating(7.8);

		Movie m3 = new Movie();
		m3.setMovieName("Inception");
		m3.setGenre("Action");
		m3.setProducer("Emma Thomas");
		m3.setLeadActorName("Joseph Gordon-Levitt");
		m3.setImdbRating(8.8);

		movieRepository.save(m1);
		movieRepository.save(m2);
		movieRepository.save(m3);
	}
}

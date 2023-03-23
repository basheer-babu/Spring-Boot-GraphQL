package com.dpoiont.graphql.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movie")
@Getter
@Setter
@NoArgsConstructor
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer mid;

    @Column
    String movieName;

    @Column
    String leadActorName;

    @Column
    String Genre;

    @Column
    String producer;

    @Column
    Double imdbRating;
}

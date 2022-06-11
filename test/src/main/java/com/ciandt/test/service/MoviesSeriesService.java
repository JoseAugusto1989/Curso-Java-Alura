package com.ciandt.test.service;

import com.ciandt.test.domain.MoviesSeries;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesSeriesService {

    private static List<MoviesSeries> moviesSeries = new ArrayList<>(List.of
        (new MoviesSeries("A Chegada", "Denis Villeneuve", 10,
        7.9, "1.Amy Adams, 2.Jeremy Renner, 3.Forest Whitaker", "Ficção Científica",
        "Um dos melhores filmes de ficção científica",
        2016, "FilmNation Entertaiment", "GloboPlay")));


    public static List<MoviesSeries> listAll(){
        return moviesSeries;
    }

}

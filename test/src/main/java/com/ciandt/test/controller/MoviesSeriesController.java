package com.ciandt.test.controller;

import com.ciandt.test.domain.MoviesSeries;
import com.ciandt.test.service.MoviesSeriesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class MoviesSeriesController {

    @GetMapping
    public ResponseEntity<List<MoviesSeries>> listMovies() {
        ResponseEntity<List<MoviesSeries>> test = ResponseEntity.ok(MoviesSeriesService.listAll());
        return test;
    }

}

package com.pratham.moviedetail.controller;

import com.pratham.moviedetail.entities.Movie;
import com.pratham.moviedetail.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
        Movie movie1 = movieService.saveMovie(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(movie1);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies(){
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{movieId}")
    public ResponseEntity<Movie> getMovieById(@PathVariable String movieId){
        Movie movie = movieService.getMovie(movieId);
        return ResponseEntity.ok(movie);
    }

}

package com.pratham.moviedetail.services;

import com.pratham.moviedetail.entities.Movie;

import java.util.List;

public interface MovieService {

    Movie saveMovie(Movie movie);
    List<Movie> getAllMovies();
    Movie getMovie(String movieId);
}

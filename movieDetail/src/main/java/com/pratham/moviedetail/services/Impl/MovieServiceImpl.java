package com.pratham.moviedetail.services.Impl;

import com.pratham.moviedetail.entities.Movie;
import com.pratham.moviedetail.exceptions.MovieDetailsNotFoundException;
import com.pratham.moviedetail.respositories.MovieRepository;
import com.pratham.moviedetail.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie movie) {
        //generate unique userid
        String randomUserId = UUID.randomUUID().toString();
        movie.setMovieId(randomUserId);
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovie(String movieId) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(() -> new MovieDetailsNotFoundException("Movie details can not be found"+movieId));
        return movie;
    }
}

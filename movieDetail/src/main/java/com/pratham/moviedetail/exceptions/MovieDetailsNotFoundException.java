package com.pratham.moviedetail.exceptions;

public class MovieDetailsNotFoundException extends RuntimeException{
    public MovieDetailsNotFoundException() {
        super("details can not be found");
    }

    public MovieDetailsNotFoundException(String message) {
        super(message);
    }
}

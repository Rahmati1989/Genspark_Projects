package com.example.movie.service;

import com.example.movie.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    Object findById(int movieId);
    void saveOverUpdate(Movie theMovie);
    void deleteById(int movieId);
}

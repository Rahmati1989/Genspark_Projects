package com.example.movie.dao;

import com.example.movie.entity.Movie;

import java.util.List;

public interface MovieDAO {
    List<Movie> findAll();
    Object findById(int theId);
    void saveOverUpdate(Movie theMovie);
    void deleteById(int theId);
}

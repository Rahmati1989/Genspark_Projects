package com.example.movie.service;

import com.example.movie.dao.MovieDAO;
import com.example.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceIMP implements MovieService {
    private final MovieDAO movieDAO;
    @Autowired
    public MovieServiceIMP(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }

    @Override
    public List<Movie> findAll() {
        return movieDAO.findAll();
    }

    @Override
    public Object findById(int movieId) {
        return movieDAO.findById(movieId);
    }

    @Override
    public void saveOverUpdate(Movie theMovie) {
        movieDAO.saveOverUpdate(theMovie);

    }

    @Override
    public void deleteById(int movieId) {
        movieDAO.deleteById(movieId);

    }
}

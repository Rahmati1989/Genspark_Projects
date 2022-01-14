package com.example.movie.controller;

import com.example.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import com.example.movie.service.MovieService;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(@Qualifier("movieServiceIMP") MovieService movieService) {
        this.movieService = movieService;
    }
    //http://localhost:8086/getMovieById/Id
    @GetMapping("/getMovieById/{movieId}")
    public Movie findById(@PathVariable int movieId){
        return (Movie) movieService.findById(movieId);
    }
    //http://localhost:8086/getAllMovie
    @GetMapping("/getAllMovie")
    public List<Movie> findAll(){
        return movieService.findAll();
    }
    //http://localhost:8086/addMovie
    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie theMovie){
        theMovie.setId(0);
        movieService.saveOverUpdate(theMovie);
        return theMovie;
    }
    //http://localhost:8086/updateMovie
    @PutMapping("/updateMovie")
    public Movie updateMovie(@RequestBody Movie updateMovie){
        movieService.saveOverUpdate(updateMovie);
        return updateMovie;
    }
    //http://localhost:8086/deleteMovie/Id
    @DeleteMapping("/deleteMovie/{movieId}")
    public String deleteMovie(@PathVariable int movieId){
        movieService.deleteById(movieId);
        return "Movie with " + movieId + " is deleted";
    }
}

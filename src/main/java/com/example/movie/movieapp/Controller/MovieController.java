package com.example.movie.movieapp.Controller;

import com.example.movie.movieapp.Entity.MovieEntity;
import com.example.movie.movieapp.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/movies")
@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;
    @PostMapping("/movie")
    public MovieEntity create(@RequestBody MovieEntity movieEntity)
    {
        MovieEntity movie= movieService.create(movieEntity);
        return movie;
    }
    @GetMapping
    public List<MovieEntity> allMovie()
    {
        return movieService.allMovie();
    }
    @DeleteMapping("/{id}")
    public MovieEntity removeMovie(@PathVariable String id)
    {

        return movieService.removeMovie(id);
    }
    @PutMapping("/{id}")
    public MovieEntity updateMovie(@PathVariable String id,@RequestBody MovieEntity movieEntity)
    {
        return movieService.updateMovie(id,movieEntity);
    }
    @GetMapping("/{id}")
    public Optional<MovieEntity> movieById(@PathVariable String id)
    {
        return movieService.movieById(id);
    }
}

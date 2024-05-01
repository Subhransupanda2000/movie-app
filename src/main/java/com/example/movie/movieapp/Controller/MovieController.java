package com.example.movie.movieapp.Controller;
import com.example.movie.movieapp.Entity.MovieEntity;
import com.example.movie.movieapp.Model.Movie;
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
    public Movie create(@RequestBody Movie movie) {
        return movieService.create(movie);
    }
    @GetMapping
    public List<Movie> allMovie()
    {
        return movieService.allMovie();
    }
    @DeleteMapping("/{id}")
    public Movie removeMovie(@PathVariable String id)
    {

        return movieService.removeMovie(id);
    }
    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable String id,@RequestBody Movie movie)
    {
        return movieService.updateMovie(id,movie);
    }
    @GetMapping("/{id}")
    public Optional<MovieEntity> movieById(@PathVariable String id)
    {
        return movieService.movieById(id);
    }
}

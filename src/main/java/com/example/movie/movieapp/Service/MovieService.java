package com.example.movie.movieapp.Service;

import com.example.movie.movieapp.Entity.MovieEntity;
import com.example.movie.movieapp.Model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {

     Movie create(Movie movie);

    List<Movie> allMovie();

    Movie removeMovie(String id);

    Movie updateMovie( String id,Movie movie);

    Optional<MovieEntity> movieById(String id);
}

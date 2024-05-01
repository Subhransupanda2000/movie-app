package com.example.movie.movieapp.Service;

import com.example.movie.movieapp.Entity.MovieEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {

    public MovieEntity create(MovieEntity movieEntity);

    List<MovieEntity> allMovie();

    MovieEntity removeMovie(String id);

    MovieEntity updateMovie( String id,MovieEntity movieEntity);

    Optional<MovieEntity> movieById(String id);
}

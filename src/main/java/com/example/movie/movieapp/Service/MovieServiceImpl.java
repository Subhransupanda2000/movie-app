package com.example.movie.movieapp.Service;

import com.example.movie.movieapp.Entity.MovieEntity;
import com.example.movie.movieapp.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public MovieEntity create(MovieEntity movieEntity) {
        MovieEntity entity= movieRepository.save(movieEntity);
        return entity;
    }

    @Override
    public List<MovieEntity> allMovie() {
        Iterable<MovieEntity> entities = movieRepository.findAll();
        List<MovieEntity> items = new ArrayList<>();
        for (MovieEntity entity : entities) {
            MovieEntity movieEntity = new MovieEntity().fromEntity(entity);
            items.add(movieEntity);
        }
        return items;
    }

    @Override
    public MovieEntity removeMovie(String id) {
        Optional<MovieEntity> movieEntity = movieRepository.findById(id);
            MovieEntity savedMovieEntity = movieEntity.get();
            movieRepository.deleteById(id);
            return new MovieEntity().fromEntity(savedMovieEntity);

    }

    @Override
    public MovieEntity updateMovie(String id,MovieEntity movieEntity) {
        MovieEntity entity = movieEntity.toEntity();
        entity = movieRepository.save(entity);
        return new MovieEntity().fromEntity(movieEntity);
    }

    @Override
    public   Optional<MovieEntity> movieById(String id) {
        Optional<MovieEntity> entity=movieRepository.findById(id);
        return entity;
    }

}

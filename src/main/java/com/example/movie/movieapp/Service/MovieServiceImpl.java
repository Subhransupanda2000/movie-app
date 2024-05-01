package com.example.movie.movieapp.Service;

import com.example.movie.movieapp.Entity.MovieEntity;
import com.example.movie.movieapp.Model.Movie;
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
    public Movie create(Movie movie) {
        MovieEntity entity=movieRepository.save(movie.toEntity());
        return new Movie().fromEntity(entity);
    }

    @Override
    public List<Movie> allMovie() {
        Iterable<MovieEntity> entities = movieRepository.findAll();
        List<Movie> items = new ArrayList<>();
        for (MovieEntity entity : entities) {
            Movie Movie = new Movie().fromEntity(entity);
            items.add(Movie);
        }
        return items;
    }

    @Override
    public Movie removeMovie(String id) {
        Optional<MovieEntity> Movie = movieRepository.findById(id);
            MovieEntity savedMovie = Movie.get();
            movieRepository.deleteById(id);
            return new Movie().fromEntity(savedMovie);

    }

    @Override
    public Movie updateMovie(String id,Movie movie) {
        MovieEntity entity = movie.toEntity();
        entity = movieRepository.save(entity);
        return new Movie().fromEntity(entity);
    }

    @Override
    public Optional<MovieEntity> movieById(String id) {
        Optional<MovieEntity> entity=movieRepository.findById(id);
        return entity;
    }

}

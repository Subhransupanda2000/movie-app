package com.example.movie.movieapp.Repository;
import com.example.movie.movieapp.Entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<MovieEntity,String> {
}

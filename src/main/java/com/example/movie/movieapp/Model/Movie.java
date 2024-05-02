package com.example.movie.movieapp.Model;

import com.example.movie.movieapp.Entity.MovieEntity;
import lombok.Data;

@Data
public class Movie {
    private String id;
    private String title;
    public Movie fromEntity(MovieEntity entity) {
        this.setId(entity.getId());
        this.setTitle(entity.getTitle());
        return this;
    }
    public MovieEntity toEntity( )
    {
        MovieEntity entity=new MovieEntity();
        entity.setTitle(this.getTitle());
        entity.setId(this.getId());
        return entity;
    }
}

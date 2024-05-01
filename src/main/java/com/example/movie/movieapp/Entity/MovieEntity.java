package com.example.movie.movieapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table
public class MovieEntity {
    @Id
    private String id;
    private String title;
    public MovieEntity fromEntity(MovieEntity entity) {
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

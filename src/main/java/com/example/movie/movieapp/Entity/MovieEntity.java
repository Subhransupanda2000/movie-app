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
}

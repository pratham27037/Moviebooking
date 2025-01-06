package com.pratham.moviedetail.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Movie_details")
public class Movie {

    @Id
    @Column(name = "ID")
    private String movieId;

    @Column(name="Movie_Name")
    private String movieName;

    @Column(name="Description")
    private String description;

    @Column(name="Language")
    private String language;

    @Column(name="Release_Date")
    private LocalDate releaseDate;

    @Column(name="Country")
    private String country;

    @Column(name="Genre")
    private String genre;
}

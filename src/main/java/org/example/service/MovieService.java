package org.example.service;

import org.example.model.Movie;
import org.example.repository.MovieRepository;
import java.util.Collection;

public class MovieService {
    private final MovieRepository repo;
    public MovieService(MovieRepository repo) { this.repo = repo; }
    public void addMovie(Movie movie) { repo.addMovie(movie); }
    public Collection<Movie> getAllMovies() { return repo.getAllMovies(); }
}
package org.example.repository;

import org.example.model.Movie;
import java.util.*;

public class MovieRepository {
    private final Map<Integer, Movie> movies = new HashMap<>();
    public void addMovie(Movie movie) { movies.put(movie.getId(), movie); }
    public Collection<Movie> getAllMovies() { return movies.values(); }
    public Movie getMovie(int id) { return movies.get(id); }
}
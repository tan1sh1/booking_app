package org.example.service;

import org.example.model.Show;
import org.example.repository.ShowRepository;
import java.util.List;

public class ShowService {
    private final ShowRepository repo;
    public ShowService(ShowRepository repo) { this.repo = repo; }
    public void addShow(Show show) { repo.addShow(show); }
    public List<Show> getShowsByMovieId(int movieId) { return repo.getShowsByMovieId(movieId); }
    public Show getShow(int id) { return repo.getShow(id); }
}
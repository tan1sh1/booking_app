package org.example.repository;

import org.example.model.Show;
import java.util.*;

public class ShowRepository {
    private final Map<Integer, Show> shows = new HashMap<>();
    public void addShow(Show show) { shows.put(show.getId(), show); }
    public Collection<Show> getAllShows() { return shows.values(); }
    public Show getShow(int id) { return shows.get(id); }
    public List<Show> getShowsByMovieId(int movieId) {
        List<Show> result = new ArrayList<>();
        for (Show show : shows.values()) {
            if (show.getMovieId() == movieId) result.add(show);
        }
        return result;
    }
}
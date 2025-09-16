package org.example.model;

public class Show {
    private int id;
    private int movieId;
    private String time;
    private int availableSeats;

    public Show(int id, int movieId, String time, int availableSeats) {
        this.id = id;
        this.movieId = movieId;
        this.time = time;
        this.availableSeats = availableSeats;
    }
    public int getId() { return id; }
    public int getMovieId() { return movieId; }
    public String getTime() { return time; }
    public int getAvailableSeats() { return availableSeats; }
    public void setAvailableSeats(int seats) { this.availableSeats = seats; }
}
package org.example.model;

public class Booking {
    private int id;
    private int showId;
    private int seatsBooked;

    public Booking(int id, int showId, int seatsBooked) {
        this.id = id;
        this.showId = showId;
        this.seatsBooked = seatsBooked;
    }
    public int getId() { return id; }
    public int getShowId() { return showId; }
    public int getSeatsBooked() { return seatsBooked; }
}
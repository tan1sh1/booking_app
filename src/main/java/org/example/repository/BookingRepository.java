package org.example.repository;

import org.example.model.Booking;
import java.util.*;

public class BookingRepository {
    private final Map<Integer, Booking> bookings = new HashMap<>();
    private int nextId = 1;
    public Booking addBooking(int showId, int seats) {
        Booking booking = new Booking(nextId++, showId, seats);
        bookings.put(booking.getId(), booking);
        return booking;
    }
    public Collection<Booking> getAllBookings() { return bookings.values(); }
}
package org.example.service;

import org.example.model.Show;
import org.example.model.Booking;
import org.example.repository.BookingRepository;
import org.example.repository.ShowRepository;

public class BookingService {
    private final BookingRepository bookingRepo;
    private final ShowRepository showRepo;

    public BookingService(BookingRepository bookingRepo, ShowRepository showRepo) {
        this.bookingRepo = bookingRepo;
        this.showRepo = showRepo;
    }

    public Booking bookSeats(int showId, int seats) {
        Show show = showRepo.getShow(showId);
        if (show != null && show.getAvailableSeats() >= seats) {
            show.setAvailableSeats(show.getAvailableSeats() - seats);
            return bookingRepo.addBooking(showId, seats);
        }
        return null;
    }
}
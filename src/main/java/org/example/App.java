package org.example;

import org.example.model.*;
import org.example.repository.*;
import org.example.service.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MovieRepository movieRepo = new MovieRepository();
        ShowRepository showRepo = new ShowRepository();
        BookingRepository bookingRepo = new BookingRepository();

        MovieService movieService = new MovieService(movieRepo);
        ShowService showService = new ShowService(showRepo);
        BookingService bookingService = new BookingService(bookingRepo, showRepo);

        // Seed data
        movieService.addMovie(new Movie(1, "Inception"));
        movieService.addMovie(new Movie(2, "Interstellar"));
        showService.addShow(new Show(1, 1, "10:00 AM", 50));
        showService.addShow(new Show(2, 2, "12:00 PM", 40));

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. List Movies\n2. List Shows\n3. Book Seats\n4. Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                for (Movie m : movieService.getAllMovies())
                    System.out.println(m.getId() + ": " + m.getName());
            } else if (choice == 2) {
                System.out.print("Enter Movie ID: ");
                int movieId = sc.nextInt();
                for (Show s : showService.getShowsByMovieId(movieId))
                    System.out.println(s.getId() + ": " + s.getTime() + " Seats: " + s.getAvailableSeats());
            } else if (choice == 3) {
                System.out.print("Enter Show ID: ");
                int showId = sc.nextInt();
                System.out.print("Enter Seats: ");
                int seats = sc.nextInt();
                Booking booking = bookingService.bookSeats(showId, seats);
                if (booking != null)
                    System.out.println("Booking successful! Booking ID: " + booking.getId());
                else
                    System.out.println("Booking failed. Not enough seats.");
            } else {
                break;
            }
        }
        sc.close();
    }
}
package com.kce.airline.service;

import com.kce.airline.model.*;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
	private List<Booking> bookings = new ArrayList<>();

	public Booking createBooking(String bookingId, Flight flight, Passenger passenger, List<Seat> seats) {

		for (Seat seat : seats) {
			if (seat.isBooked()) {
				System.out.println("Seat " + seat.getSeatNumber() + " is already booked.");
				return null;
			}
		}
		for (Seat seat : seats) {
			seat.setBooked(true);
		}

		Booking booking = new Booking(bookingId, flight, passenger, seats);
		bookings.add(booking);
		System.out.println("Booking created successfully: " + booking);
		return booking;
	}

	public void cancelBooking(String bookingId) {
		Booking toCancel = null;
		for (Booking b : bookings) {
			if (b.getBookingId().equalsIgnoreCase(bookingId)) {
				toCancel = b;
				break;
			}
		}

		if (toCancel != null) {

			for (Seat seat : toCancel.getSeats()) {
				seat.setBooked(false);
			}
			bookings.remove(toCancel);
			System.out.println("Booking cancelled: " + bookingId);
		} else {
			System.out.println("Booking not found.");
		}
	}

	public Booking findBookingById(String bookingId) {
		for (Booking b : bookings) {
			if (b.getBookingId().equalsIgnoreCase(bookingId)) {
				return b;
			}
		}
		return null;
	}

	public void displayBookings() {
		if (bookings.isEmpty()) {
			System.out.println("No bookings available.");
		} else {
			for (Booking b : bookings) {
				System.out.println(b);
			}
		}
	}
}

package com.kce.airline.exception;

public class BookingNotFoundException extends Exception {
	public BookingNotFoundException(String bookingId) {
		super("Booking with ID " + bookingId + " not found.");
	}
}

package com.kce.airline.model;

import java.util.List;

public class Booking {
    private String bookingId;
    private Flight flight;
    private Passenger passenger;
    private List<Seat> seats;
    private boolean confirmed;

    public Booking(String bookingId, Flight flight, Passenger passenger, List<Seat> seats) {
        this.bookingId = bookingId;
        this.flight = flight;
        this.passenger = passenger;
        this.seats = seats;
        this.confirmed = false;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", flight=" + flight + ", passenger=" + passenger + ", seats="
				+ seats + ", confirmed=" + confirmed + "]";
	}
    
}

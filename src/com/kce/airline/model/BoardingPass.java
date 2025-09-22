package com.kce.airline.model;

import java.time.LocalDateTime;

public class BoardingPass {
	private String passId;
	private Passenger passenger;
	private Flight flight;
	private Seat seat;
	private String gate;
	private LocalDateTime issueTime;

	public BoardingPass(String passId, Passenger passenger, Flight flight, Seat seat, String gate) {
		this.passId = passId;
		this.passenger = passenger;
		this.flight = flight;
		this.seat = seat;
		this.gate = gate;
		this.issueTime = LocalDateTime.now();
	}

	public String getPassId() {
		return passId;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public Seat getSeat() {
		return seat;
	}

	public String getGate() {
		return gate;
	}

	public LocalDateTime getIssueTime() {
		return issueTime;
	}

	@Override
	public String toString() {
		return "BoardingPass [ID=" + passId + ", Passenger=" + passenger.getName() + ", Flight="
				+ flight.getFlightNumber() + ", Seat=" + seat.getSeatNumber() + ", Gate=" + gate + ", Time=" + issueTime
				+ "]";
	}
}

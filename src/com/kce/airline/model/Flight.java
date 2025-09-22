package com.kce.airline.model;

import java.util.List;

public class Flight {
	private String flightNumber;
	private String origin;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private Aircraft aircraft;
	private List<Seat> seats;

	public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime,
			Aircraft aircraft, List<Seat> seats) {
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.aircraft = aircraft;
		this.seats = seats;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", origin=" + origin + ", destination=" + destination
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", aircraft=" + aircraft
				+ ", seats=" + seats + "]";
	}

}

package com.kce.airline.model;

import java.util.ArrayList;
import java.util.List;

public class Aircraft {
	private String model;
	private int capacity;
	private List<Seat> seats;

	public Aircraft(String model, int capacity) {
		this.model = model;
		this.capacity = capacity;
		this.seats = new ArrayList<>();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void addSeat(Seat seat) {
		if (seats.size() < capacity) {
			seats.add(seat);
		}
	}

	@Override
	public String toString() {
		return "Aircraft [model=" + model + ", capacity=" + capacity + "]";
	}
}

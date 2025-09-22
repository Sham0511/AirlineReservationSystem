package com.kce.airline.service;

import com.kce.airline.model.*;

import java.util.ArrayList;
import java.util.List;

public class FlightService {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public Flight findFlightByNumber(String flightNumber) {
        for (Flight f : flights) {
            if (f.getFlightNumber().equalsIgnoreCase(flightNumber)) {
                return f;
            }
        }
        return null;
    }

    public void displayFlights() {
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
        } else {
            for (Flight f : flights) {
                System.out.println(f);
            }
        }
    }
}

package com.kce.airline.service;

import com.kce.airline.model.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerService {
    private List<Passenger> passengers = new ArrayList<>();

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public Passenger findPassengerById(String passengerId) {
        for (Passenger p : passengers) {
            if (p.getPassengerId().equalsIgnoreCase(passengerId)) {
                return p;
            }
        }
        return null;
    }

    public void displayPassengers() {
        if (passengers.isEmpty()) {
            System.out.println("No passengers found.");
        } else {
            for (Passenger p : passengers) {
                System.out.println(p);
            }
        }
    }
}

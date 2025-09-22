package com.kce.airline.service;

import com.kce.airline.model.*;

public class CheckInService {
    public BoardingPass checkIn(String passId, Booking booking, Seat seat, String gate) {
        if (!booking.isConfirmed()) {
            System.out.println("Booking not confirmed. Cannot issue boarding pass.");
            return null;
        }

        if (!seat.isBooked()) {
            System.out.println("Seat is not booked. Check-in failed.");
            return null;
        }

        BoardingPass bp = new BoardingPass(passId, booking.getPassenger(), booking.getFlight(), seat, gate);
        System.out.println("Boarding Pass issued: " + bp);
        return bp;
    }
}

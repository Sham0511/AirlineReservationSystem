package com.kce.airline.exception;

public class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(String seatNumber) {
        super("Seat " + seatNumber + " is not available for booking.");
    }
}

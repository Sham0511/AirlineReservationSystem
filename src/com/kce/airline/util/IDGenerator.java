package com.kce.airline.util;

public class IDGenerator {
    static int flightCount = 100;
    static int passengerCount = 1000;
    static int bookingCount = 5000;
    static int paymentCount = 8000;
    static int bpCount = 9000;

    public static String getFlightId() {
        flightCount++;
        return "FL" + flightCount;
    }

    public static String getPassengerId() {
        passengerCount++;
        return "P" + passengerCount;
    }

    public static String getBookingId() {
        bookingCount++;
        return "B" + bookingCount;
    }

    public static String getPaymentId() {
        paymentCount++;
        return "PAY" + paymentCount;
    }

    public static String getBoardingPassId() {
        bpCount++;
        return "BP" + bpCount;
    }
}

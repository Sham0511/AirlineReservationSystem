package com.kce.airline.exception;

public class InvalidPaymentException extends Exception {
    public InvalidPaymentException(String message) {
        super("Payment failed: " + message);
    }
}

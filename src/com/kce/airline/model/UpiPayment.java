package com.kce.airline.model;

public class UpiPayment extends Payment {
    private String upiId;

    public UpiPayment(int paymentId, double amount, String upiId) {
        super(paymentId, amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        setStatus("Completed");
        System.out.println("UPI Payment Successful for amount: " + getAmount());
    }
}

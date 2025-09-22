package com.kce.airline.model;

public class CardPayment extends Payment {
    private String cardNo;
    private String expiryDate;

    public CardPayment(int paymentId, double amount, String cardNo, String expiryDate) {
        super(paymentId, amount);
        this.cardNo = cardNo;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
 
        setStatus("Completed");
        System.out.println("Card Payment Successful for amount: " + getAmount());
    }
}

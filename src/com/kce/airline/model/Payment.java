package com.kce.airline.model;

public abstract class Payment {
    private int paymentId;
    private double amount;
    private String status; 
    private boolean success;

    public Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = "Pending";
        
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    protected void setStatus(String status) {
        this.status = status;
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public abstract void processPayment();

    @Override
    public String toString() {
        return "Payment [ID=" + paymentId + ", Amount=" + amount + ", Status=" + status + "]";
    }
}

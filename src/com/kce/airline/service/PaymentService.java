package com.kce.airline.service;

import com.kce.airline.model.CardPayment;
import com.kce.airline.model.Payment;

public class PaymentService {
    public Payment processPayment(String paymentIdStr, double amount) {
        int paymentId = Integer.parseInt(paymentIdStr);
        CardPayment payment = new CardPayment(paymentId, amount, "1234-5678-9012-3456", "12/28");
        
        payment.processPayment();
        return payment;
    }
}

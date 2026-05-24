package com.Polymorphism;

public class PaymentProcessor {
    public static void processPayment(double amount, Payment payment){
        payment.pay(amount);
    }
}

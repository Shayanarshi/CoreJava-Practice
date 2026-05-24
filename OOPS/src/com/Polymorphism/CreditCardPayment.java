package com.Polymorphism;

public class CreditCardPayment  extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid: "+amount+" With Credit Card");
    }
}

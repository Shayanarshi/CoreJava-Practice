package com.Polymorphism;

public class UpiPayment extends Payment {
    @Override

    public void pay(double amount){
        System.out.println("Paid:"+amount+" With Upi");
    }

}

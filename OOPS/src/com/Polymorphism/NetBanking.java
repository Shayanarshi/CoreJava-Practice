package com.Polymorphism;

public class NetBanking extends Payment {
    @Override
    public void pay(double amount){
        System.out.println("Paid: "+ amount+ " With NetBanking") ;
    }
}

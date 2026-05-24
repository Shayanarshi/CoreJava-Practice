package com.example;

import java.util.Scanner;

public class LoanEligibilityChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age :");
        int age = sc.nextInt();

        System.out.println("Please enter Your Salary:");
        double sal = sc.nextDouble();

        //System.out.println("Are you a Citizen of India (Yes/No):");
        //String cit = sc.next();

        if(age >= 18 && sal >= 50000 ) {
            System.out.println("You are eligible for loan");
        } else {
            System.out.println("Not eligible");
        }

        sc.close();
    }

}

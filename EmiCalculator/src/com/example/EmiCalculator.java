package com.example;

import java.util.Scanner;

public class EmiCalculator {

	public static void main(String[] args) {
		// connect Scanner to Keyboard
		Scanner sc = new Scanner(System.in);
		// user input
		System.out.println("Please Enter the Principal Amount: ");
		// Stored String to required data type
		double principleAmount = sc.nextDouble();
		System.out.println("Please enter the rate of interest per annum");
		double rateOfInterest = sc.nextDouble();
		System.out.println("Please Enter the Tenure in years");
		int tenureInYears = sc.nextInt();
		
		// convert interest  month wise 
		
		double rate = rateOfInterest / 12 / 100;
		
		// tenure in years to months 
		int Time = tenureInYears * 12;
		
		double x = Math.pow(1+rate,Time);
		// Calculate Emi
		double emi = (principleAmount * rate* x)/(x-1);
		
		
		System.out.println("The EMI is:" +emi);
		sc.close();
	}
}

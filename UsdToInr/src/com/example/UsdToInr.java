package com.example;

import java.util.Scanner;

public class UsdToInr {

	public static void main(String[] args) {
		// connecting Scanner to the Keyboard
		Scanner sc = new Scanner(System.in);
		// default message to show what to enter 
		System.out.println("Please Enter the Values in Dollar:");
		// for converting the value which is stored in 
		// buffered in the form of a String to required data type
		double usd = sc.nextDouble();
		
		double inr = usd * 88.15;
		System.out.println("The Values in Indian Rupees is: "+inr);
		sc.close();	
	}
}

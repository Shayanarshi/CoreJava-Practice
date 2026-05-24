package com.example;

import java.util.Scanner;

public class FareCalculatorThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Distance in Km:");
		double distance = sc.nextDouble();
		
		double fare  = 0;
		
		if ( distance <= 3) {
				fare = 0;
		} else if (distance<=6) {
				fare = (distance-3)*6 ;
		} else{
			 fare =(3*6)+ (distance-6)*12;
		}
		System.out.println("Your Fare is \u20B9"+fare);
		sc.close();
	}
}



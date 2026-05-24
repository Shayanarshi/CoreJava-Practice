package com.example;

import java.util.Scanner;

public class FareCalculatorTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Distance in Km:");
		double distance = sc.nextDouble();
		
		double fare  = 0;
		
		if ( distance <= 3) {
			System.out.println("Your fare is: " +fare);
		} else if (distance<=6) {
			System.out.println("Your fare is: " + (distance-3)*6 );
		} else{
			System.out.println("Your Fare is:" + (3*6 + (distance-6)*12));
		}
		sc.close();
	}
}

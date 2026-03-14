package com.example;

import java.util.Scanner;

public class FareCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Distance in Km:");
		double distance = sc.nextDouble();
		
		if ( distance <= 3) {
			System.out.println("Your fare is: " + 0);
		} else if (distance>3 && distance<6) {
			System.out.println("Your fare is: " + (distance-3)*6 );
		} else{
			System.out.println("Your Fare is:" + (3*6 + (distance-6)*12 ));
		}
		sc.close();
	}

}



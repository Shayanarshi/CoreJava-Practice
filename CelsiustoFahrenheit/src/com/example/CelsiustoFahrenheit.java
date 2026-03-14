package com.example;

import java.util.Scanner;

public class CelsiustoFahrenheit {

	public static void main(String[] args) {
		// Connecting scanner with Keyboard
		Scanner sc = new Scanner(System.in);
		// taking user input
		System.out.println("Please Enter the Value of Celcius:");
		double c = sc.nextDouble();
		
		// formula:   f = (c * 9/5) + 32
		double f = (c*1.8)+32;
		System.out.println("The Value of the Fahrenheit is: " +f);
		sc.close();
	}
}

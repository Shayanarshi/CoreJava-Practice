package com.example;

import java.util.Scanner;

public class AgeCalculation{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Birth Year:");
		int birthYear = sc.nextInt();
		System.out.println("Please Enter the Current Year:");
		int currentYear = sc.nextInt();
		int age = (currentYear - birthYear);
		System.out.println("Your approximate age is: " + age + "Years" );
		sc.close();
	}
}

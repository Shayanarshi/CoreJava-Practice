package com.example;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Principal Amount:");
		double pa = sc.nextDouble();
		System.out.println("Enter the rate of Interest per Annum");
		double roi = sc.nextDouble();
		System.out.println("Enter the Time in Years");
		double t = sc.nextDouble();
		
		double interest = (pa * roi * t) / 100;
		System.out.println("The Simple Interest = " + '\u20B9' + interest);
		sc.close();
	}

}

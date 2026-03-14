package com.example;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Year:");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("Leap Year");
		}//else if (year % 4 == 0 && year % 100 == 0 && year % 400 ==0)
		else if (year % 400 ==0)
		{
			System.out.println("leap year");
		} else {
			System.out.println("Not a leap year");
		}
		
		
		sc.close();
	}

}

package com.example;

import java.util.Scanner;

public class UsingTernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Year:");
		int year = sc.nextInt();
		
		String str = (year %4 == 0 && year % 100 != 0)?
				"leap year " 
				:(year % 400 == 0 ? "leap year" : "Not a leap year"); 
		System.out.println(str);
		sc.close();
	}

}

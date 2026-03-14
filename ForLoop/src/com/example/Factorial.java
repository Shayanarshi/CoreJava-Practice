package com.example;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		long result = findFactorial(n);
		System.out.println("The Factorial of "+n + " is " + result);
		sc.close();
		
		
	}
	private static long findFactorial(int n) {
		long fact = 1;
		for(int i =1; i<=n;i++)
			fact = fact * i;
		return fact;
		
		
	}

}

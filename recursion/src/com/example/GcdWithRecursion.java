package com.example;

import java.util.Scanner;

public class GcdWithRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		int result = gcd(a,b);
		System.out.println("The gcd of " + a + " and "+ b + " is "+ result );
		sc.close();
	}
	private static int gcd(int a, int b) {
		if( b == 0)
			return a;
		else
			return gcd(b, a%b);
	}
}

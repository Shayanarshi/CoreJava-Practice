package com.example;
import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number: ");
		int num2 = sc.nextInt();
		int gcd = greatestCommonDivisor(num1,num2);
		System.out.println("The gcd is "+ gcd);
		sc.close();
	}
	private static int greatestCommonDivisor(int num1, int num2 ) {
		// using while loop
		
		while (num2!= 0) {
		int temp = num2;
		num2 = num1 % num2;
		num1 = temp;
		}
		return num1;
	}
}

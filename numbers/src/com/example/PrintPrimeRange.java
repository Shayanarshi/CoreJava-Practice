package com.example;

import java.util.Scanner;

public class PrintPrimeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number of the Range:");
		int a = sc.nextInt();
		System.out.println("Enter the First Second of the Range:");
		int b = sc.nextInt();
		System.out.println("Prime Numbers Between "+ a + " and " +b + " is :" );
		printPrimeRange(a,b);
		sc.close();
	}
	private static void printPrimeRange(int a,int b) {
		
		for (int i =a; i<=b;i++) {
			
				boolean isPrime=true;
			for (int j=2; j<=Math.sqrt(i);j++) {
				if(i % j == 0) {
				isPrime = false;
				break;
				} 
			}
			if (isPrime)
				System.out.print(i + " ");
		}
	}

}

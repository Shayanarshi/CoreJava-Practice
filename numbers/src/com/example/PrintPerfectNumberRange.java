package com.example;

import java.util.Scanner;

public class PrintPerfectNumberRange {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The First Value of the Range:");
	int a = sc.nextInt();
	System.out.println("Enter The Second Value of the Range:");
	int b = sc.nextInt();
	System.out.println("The Perfect Number Between " + a +" and "+ b + " is: ");
	printPerfectNumber(a,b);
	
	sc.close();
	}
	
	private static void printPerfectNumber(int a,int b) {
		
		for(int num =a; num<=b; num++) {
		int sum =0;
		for(int i=1;i<=num/2;i++) {
			if(num % i == 0) {
				sum += i;
				}
			}
		if (num == sum) {
			System.out.print(num +" ");
			}
		}
	}
}

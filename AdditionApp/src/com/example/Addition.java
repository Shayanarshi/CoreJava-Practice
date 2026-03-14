package com.example;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		int a = sc.nextInt();
		System.out.println("Please Enter the Second Number:");
		int b = sc.nextInt();
		
		int c = a + b;
		System.out.println("The Addition of a and b is:" +c);
		sc.close();
	}
}
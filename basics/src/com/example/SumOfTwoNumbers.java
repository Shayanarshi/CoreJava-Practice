package com.example;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your First Number:");
		int firstNumber = sc.nextInt();
		
		System.out.println("Please Enter Your Second Number:");
		int secondNumber = sc.nextInt();
		
		int Sum = firstNumber + secondNumber;
		System.out.println("The Sum of Two Number is = " +Sum);
		sc.close();
		
	}

}

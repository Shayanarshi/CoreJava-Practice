package com.example;
import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		boolean flag = isSpy(number);
		if (flag) {
			System.out.println("The number "+ number + " is Spy Number");
		}else {
			System.out.println("The number "+ number + " is  not a Spy Number");
		}
		sc.close();
	}
	private static boolean isSpy(int number) {
		int product = 1;
		int sum = 0;
		while(number>0) {
			int digit = number % 10;
			sum = sum + digit;
			product = product * digit;
			number = number /10;
		}
		if (sum == product)
			return true;
		else
			return false;
	}
}

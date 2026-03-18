package com.example;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int result = printSumOfDigits(n);
		System.out.println("The sum of the digits "+n+ " is: " +result);
		sc.close();
	}
	
	private static int printSumOfDigits(int n) {
		int sum =0;
		while(n > 0) {
			int digit = n % 10;
			sum += digit; 
            n /= 10;
		}
		return sum;
	}

}

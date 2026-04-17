package com.example;
import java.util.Scanner;
public class DigitRemove {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		System.out.println("Enter the Digit to remove:");
		int digitToRemove = input.nextInt();
		int result =toRemove(num,digitToRemove);
		System.out.println("The result is: " +result);
		input.close();
	}
	
	private static int toRemove(int num, int digitToRemove) {
		
		int result = 0;
		int place = 1;
		while(num>0) {
			int digit = num % 10;
			if(digit != digitToRemove) {		
				result = result + digit * place;
				place = place *10;
			}
			num = num/10;
		}
		return result;
	}
}

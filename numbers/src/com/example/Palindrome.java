package com.example;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		boolean flag = isPalindrome(number);
		if (flag) {
			System.out.println("The number " + number +" is Palindrome.");
		}else {
			System.out.println("The number " + number +" is not Palindrome.");
		}
		
		sc.close();
	}
	private static boolean isPalindrome(int number) {
		
		int temp = number;
		int reverse = 0;
		
		while(temp>0) {
			
			int digit = temp %10;
			reverse = reverse * 10 + digit;
			temp = temp /10;
		}
		if(reverse == number) 
			return true;
		else 
			return false;
	}
}

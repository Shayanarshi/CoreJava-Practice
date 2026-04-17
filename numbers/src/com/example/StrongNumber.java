package com.example;
import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number:");
		int number = sc.nextInt();
		boolean flag = isStrong(number);
		if(flag) {
			System.out.println("The Number "+ number + " is Strong Number");
		}else {
			System.out.println("The Number "+ number +" is not Strong Number");
		}
		sc.close();
	}
	
	private static boolean isStrong(int number) {
		
		int temp = number;
		int sum = 0;
		while(temp >0 ) {
			int digit = temp %10;
		// factorial
		int fact = 1;
		for(int i =1;i<=digit;i++)
			fact = fact*i;
		
		
		sum = sum +fact;
		temp = temp/10;
	}
		if(sum == number)
			return true;
		else
			return false;
}
}

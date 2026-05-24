package com.example;
import java.util.Scanner;
public class FcatorialWithRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int result = factorial(num);
		System.out.println("The Factorial of " + num + " is " + result);
		sc.close();
	}
	
	private static int factorial(int num) {
		if(num == 0 || num ==1)
			return 1;
			else
				return num * factorial(num-1);
				
	}

}

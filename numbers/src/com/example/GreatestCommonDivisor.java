package com.example;
import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number: ");
		int num2 = sc.nextInt();
		int gcd = greatestCommonDivisor(num1,num2);
		System.out.println("The gcd is "+ gcd);
		sc.close();
	}
	private static int greatestCommonDivisor(int num1, int num2 ) {
		// using for loop
		/* int gcd = 1;
		int temp =0;
		
		if(num1> num2) {
			temp = num2;
		}else {
			temp = num1;
		}
		for(int i =2;i<=temp;i++) {
			
			if( num1% i == 0 && num2 % i == 0)
				gcd = i;
		}
		return gcd;
		*/
		
		
		// using while loop
		while (num2!= 0) {
		int temp = num2;
		num2 = num1 % num2;
		num1 = temp;
		}
		return num1;
	}

}

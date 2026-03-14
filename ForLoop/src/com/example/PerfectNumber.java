package com.example;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		boolean flag = isPerfect(number);
		if (flag) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not a perfect Number");
		}
		sc.close();
		

	}
	private static boolean isPerfect(int number) {
				int sum= 0;
		for (int i =1; i<= number/2;i++ ) {
			if(number % i == 0 ) {
			sum +=i;
			}
		}
		if (number == sum) {
			return true;
		}else {
			return false;
		}	
	}
}

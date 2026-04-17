package com.example;

import java.util.Scanner;

public class PrimeMidLevel{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you wanna Check:");
		int n = sc.nextInt();
	 checkPrime(n);
		

		sc.close();
	}
	
	private static boolean checkPrime(int n) {
		
		if (n<=1) {
			System.out.println("Not prime");
			return false;
		}
		
		 boolean flag = true;
		for (int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				flag = false;
				break;
			}
		}
		if(flag == true) {
			System.out.println("prime");
		} else {
			System.out.println("not a prime");
		}
		return flag;
		
	}
}
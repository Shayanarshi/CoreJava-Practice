/*
 * If sum of the factors of a number excluding the 
given number, is equals to the same number then it is 
called perfect number. 
ex: number = 6 
sum of the factors = 1 + 2 + 3 = 6 
“Perfect number” 
 */
package com.example;

import java.util.Scanner;

public class PerfectNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N:");
		int n = sc.nextInt();
		boolean flag = isPerfect(n);
		
		if(flag ) {
			System.out.println("Perfect");
		}else {
			System.out.println("not a perfect");
		}
		
		sc.close();
	}

	private static boolean isPerfect(int n) {
		int sum = 0;
		for(int i =1; i<= n/2; i++) {
			if(n % i ==0 ) {
				sum += i;
			}	
		}	
		if(n == sum) {
			return true;
		}
			else {
				return false;
			}
		}	
	}

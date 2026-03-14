package com.example;

import java.util.Scanner;

public class PrimeNumberBruteForce{
	  public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number Which You want to check:");
		int n = sc.nextInt();
		checkPrime(n);
		
		
		sc.close();
	}
	  
	  private static void checkPrime(int n ) {
		  int count = 0;
		   for(int i =1; i<=n;i++) {
			   if(n % i == 0) {
				   count++;
			   }
		   }
		   if (count == 2) {
			   System.out.println("prime");
		   }else {
			   System.out.println("not a prime");
		   }
	  }    
  }
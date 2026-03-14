package com.example;

import java.util.Scanner;

public class PrimeNumberBruteForce{
  		public static void main(String[]args) {
  			
  			Scanner sc = new Scanner (System.in);
  			System.out.println("Enter the Number to Check:");
  			int n = sc.nextInt();
  			printPrime(n);
  			sc.close();
  		}
  		
  		private static void printPrime(int n ) {
  		 	int count = 0;
  			for (long i =2;i<=n/2;i++) {
  				
  				if(n % i == 0) {
  					count++;
  				}
  			}
  			if(count == 2) {
  			System.out.println(" Prime");
  		}else {
  			System.out.println("Not a prime");
  		}
  	}
}
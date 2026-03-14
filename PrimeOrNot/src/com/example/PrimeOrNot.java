package com.example;
import java.util.Scanner;

public class PrimeOrNot{
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long n = sc.nextLong();
		boolean flag = isPrime(n);
		
		if(flag == true) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");
		}
		
		
		sc.close();
	}
	
	private static boolean isPrime(long n) {
		if (n<1) {
			return false;
		}
		
		for(long i =2 ; i<=Math.sqrt(n);i++) {
			if (n % i == 0) {
				return false; 
			}
			}
		return true;
		}
	}
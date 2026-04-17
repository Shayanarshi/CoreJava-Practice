package com.example;
import java.util.Scanner;
	public class Fibonacci{
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of Terms:");
			int n = sc.nextInt();
			printFibonacci(n);
			sc.close();
			
			
		}
		private static void printFibonacci(int n) {
			
			int firstNumber =0,secondNumber = 1;
			for(int i =0;i<=n;i++) {
				System.out.print(firstNumber + "  ");
				
				int nextNumber = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = nextNumber;
				
			}
		}
	}
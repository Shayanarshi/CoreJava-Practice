package com.example;
import java.util.Scanner;
public class SumOfNNaturalNumber{
	public static void main(String[ ]args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		int result = findSum(n);
		System.out.println("The Sum of N Natural nuumber = " + result);
		sc.close();
	}
	private static int findSum(int n) {
		int sum = 0;
				for (int i =1;i<=n;i++) {
					sum= sum +i;
				}
		return sum;
	}
}
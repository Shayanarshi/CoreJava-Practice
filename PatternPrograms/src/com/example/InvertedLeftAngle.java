package com.example;

import java.util.Scanner;

public class InvertedLeftAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int n = sc.nextInt();
		printInvertedLeftAngle(n);
		sc.close();

	}
	private static void printInvertedLeftAngle(int n) {
		// row code
			for(int i =1;i<=n;i++) {
				// for space
				for (int s = 1; s <= (i-1)*2; s++) {
					System.out.print(" ");
				}
				//for star
				for(int j=1;j<=n-i+1;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
	}

}

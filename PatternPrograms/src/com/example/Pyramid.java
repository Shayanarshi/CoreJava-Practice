package com.example;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the vakue of N:");
		int n = sc.nextInt();
		printPyramid(n);
		sc.close();
		
	}
	private static void printPyramid(int n) {
		// for rows
		for(int i =1;i<=n;i++) {
			// for space
			for(int s = 1; s<= 2*(n-i);s++) {
				System.out.print(" ");
			}
			// for stars
			for(int j=1;j<= 2*i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		
		}
	}

}

package com.example;
import java.util.Scanner;
public class HollowSquare {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int n = sc.nextInt();
		printHollowSquare(n);
		sc.close();
	}
	private static void printHollowSquare(int n ) {
		// for rows
		for(int i=1;i<=n;i++) {
			// for star
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n || i==1 || i==n) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
	}
}
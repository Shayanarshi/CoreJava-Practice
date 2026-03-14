/**Program: Pascal triangle.
 The edges of each row of the pascal triangle are 1's.
The middle elements of a row are the sum of the
corresponding two elements of the above row.
 if n = 5, **/
package com.example;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N:");
		int n = sc.nextInt();
		printPascalTriangle(n);
		sc.close();

	}
	private static void printPascalTriangle(int n) {
		// for row
		for(int i =0;i<n;i++) {
			// for space
			for(int s = 1; s<=n-i-1;s++) {
				System.out.print(" ");
			}
			// for number
			for(int j=0;j<=i;j++) {
				int num = factorial(i)/(factorial(j)*factorial(i-j));
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	private static int  factorial(int i) {
		
		int fact = 1;
		for(int k=1;k<=i;k++) {
			fact *= k;
		
		}
		return fact;
		
	}
	
}

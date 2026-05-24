package com.example;

import java.util.Scanner;

public class FibonacciWithRecursion {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of Terms");
	int n = sc.nextInt();
	for (int i =0;i<n;i++) {
		int x = fibonacci(i);
		System.out.print(x + " ");
	}
	sc.close();
	}
	private static int fibonacci(int n) {
		
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}

}

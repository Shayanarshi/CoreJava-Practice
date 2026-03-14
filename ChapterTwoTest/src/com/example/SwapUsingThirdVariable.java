package com.example;

public class SwapUsingThirdVariable{

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Before Swapping x = " + x + " y = " + y);
		
		int temp;  // temporary variable
		temp = x;  // 10
		x = y;     // 20
		y = temp;  // 10 
		System.out.println("Before Swapping x = " + x + " y = " + y);	
	}
}
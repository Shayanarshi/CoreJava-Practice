package com.example;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		 int a = 5;
		 int b = 6;
		 System.out.println("Before Swapping  a= " +a + " and b= " +b );
		 
		  a = a + b;  //11
		  b = a - b;  //5
		  a = a - b; //6
		 System.out.println("After Swapping  a= " +a + " and b= " +b );
	}

}
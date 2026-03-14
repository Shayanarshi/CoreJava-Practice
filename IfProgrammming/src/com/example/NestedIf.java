package com.example;

public class NestedIf {

	public static void main(String[] args) {
		int a = 2,b= 3,c= 5;
		
		
		
		
		if (a > b) {
			if(b > c) {
				System.out.println(a +"is greatest");
			}else 
				System.out.println(c+ "is greatest");
		}
		else if (b>c) {
			System.out.println(b + " is greatest");
		}
		else 
			System.out.println(c + " is greatest");
	}
}

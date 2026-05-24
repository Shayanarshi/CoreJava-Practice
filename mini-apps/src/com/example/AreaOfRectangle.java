package com.example;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Value of Length in cm:");
		double l = sc.nextDouble();
		System.out.println("Please Enter the value of Width in cm: ");
		double w = sc.nextDouble();
		
		double area = l*w;
		System.out.println("The Area of Rectangle is : " + area + "cm\u00B2");
		sc.close();
	}

}

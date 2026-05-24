package com.example;

import java.util.Scanner;

public class UnitConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Value in Meter:");
		 double meter = sc.nextDouble();
		 double cm = meter * 100;
		 double mm = meter *1000;
		 
		 System.out.println("The Values in Cm is :" +cm);
		 System.out.println("The Values in mm is :" +mm);
		 sc.close(); 
	}

}

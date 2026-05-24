package com.example;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		// establishing the connection between Scanner class to the Keyboard
		Scanner sc = new Scanner(System.in);
		// User input
		System.out.println("Please Enter Your Height in cm:");
		double h = sc.nextDouble();
		System.out.println("Please Enter Your Weight in Kg:");
		double w = sc.nextDouble();
		
		double soh = (h*h)/10000; //  values in meter square 
		double bmi = w/soh;  // formula to calculate the BMI
		System.out.printf("Your BMI is %.2f%n",bmi);
		
		if(bmi <18.5 ) {
				System.out.println("You're UnderWeight,please take care of your diet.");
		} else if (bmi >= 18.5 && bmi<=24.9) {
				System.out.println("You're Having Normal Weight,don't worry,sit back and relax.");
		}else if (bmi >= 25 && bmi<=29.9){
				System.out.println("You're OverWeight,please take proper diet.");
		}  else {
				System.out.println("Warning: You fall in the OBESE category. Please consult a doctor.");
				sc.close();
			}
		}	
	}
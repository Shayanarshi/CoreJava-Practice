package com.example;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the value of the Fahremheit:");
		 double f = sc.nextDouble();
		 
		 double c = (f-32)*5/9;
		 System.out.println("The Value of celcius is :" +c);
		 sc.close();
	}

}

package com.example;

import java.util.Scanner;

public class TypesOfTraingle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the  Value of First Side of a Traingle:");
		int firstSide = sc.nextInt();
		System.out.println("Please Enter the  Value of Second Side of a Traingle:");
		int secondSide = sc.nextInt();
		System.out.println("Please Enter the  Value of Third Side of a Traingle:");
		int thirdSide = sc.nextInt();
		
		if(firstSide == secondSide && secondSide == thirdSide) {
		System.out.println("It's an Equilateral Traingle");
		}else if (firstSide == secondSide || secondSide == thirdSide || thirdSide == firstSide) {
			System.out.println(" It's an Isosceles Traingle");
		}else {
			System.out.println(" It's a Scalene Traingle");
			sc.close();
		}
	}

}

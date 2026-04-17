/** 
 * This program has to accept 3 sides of a triangle as input 
 * and it has to do the following, if the 3 sides can form a triangle. 
 * 1. if 3 sides are equal, display "Equilateral triangle" 
 * 2. if any 2 sides are equal, display "Isosceles triangle" 
 * 3. if the sides are different , display "Scalane triangle" 
 */


package com.example;

import java.util.Scanner;

public class TypesOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the  value of side1 of a  traingle");
		int a = sc.nextInt();
		
		System.out.println("Please enter the value of side2 of a  traingle");
		int b = sc.nextInt();
		
		System.out.println("Please enter the value of  side3 of a  traingle");
		int c = sc.nextInt();
		
		if(a+b>c || b+c>a || c+a>b) {
			if(a == b && b == c ) 
				System.out.println("Equilateral Triangle");
			 else if(a==b || b == c || c==a) 
				System.out.println("Isosceles Triangle");
			else System.out.println("Scalene Triangle");
		}
		else {
			System.out.println("  The Given Sides can't form  aTraingle");
		}
		sc.close();
	}

}

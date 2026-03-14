/*
* This program is to check whether a given year is
* a leap year or not.
* 1. if the year is divisible by 4 and not divisible by 100
then it is a leap year.
* 2. if the year is divisible by 4 and 100 then it must be
divisible by 400 also, then it is a leap year.
* 3. if the year is not divisible by 4 then it is not a leap year.|
*/
package com.example;

import java.util.Scanner;

public class LyTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		
		if (year %4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println(year + " is a leap year");
				}
				else {
					System.out.println(year + " not a leap year");
				}
			}
			else {
				System.out.println(year +" is a leap year");
			}
		}
		else {
			System.out.println(year+ " not a leap year");
		}
		
		sc.close();
		
	}
}
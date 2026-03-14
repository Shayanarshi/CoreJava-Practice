package com.example;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the value of the paise");
		int paise = sc.nextInt();
		int r =0 , fty=0, twy=0, ten = 0 , one = 0;
		
		if (paise>=100) {
			r = paise/100;
			paise = paise%100;
		}
		
		if (paise>=50) {
			fty = paise/50;
			paise = paise%50;
		}

		if (paise>=20) {
			twy = paise/20;
			paise = paise%20;
		}

		if (paise>=10) {
			ten = paise/10;
			paise = paise%10;
		}
	
			one= paise;
		

			
		
		System.out.println("Rupees:"+r);
		System.out.println("fifty:"+fty);
		System.out.println("Twenty:"+twy);
		System.out.println("Ten:"+ten);
		System.out.println("One:"+one);
		sc.close();
		}
}
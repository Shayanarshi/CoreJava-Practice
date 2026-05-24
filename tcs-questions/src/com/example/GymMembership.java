package com.example;

import java.util.Scanner;

public class GymMembership {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int m = sc.nextInt();
		

		
		if(m<0) {
			System.out.println("invalid input");
		}else if(m==0) {
			System.out.println("0");
		}else if (m == 1) {
			System.out.println("2000");
		}else if (m<=3) {
			System.out.println("5000");
		}else if (m<=6) {
			System.out.println("9000");
		}else if (m == 9) {
			System.out.println("12000");
		}else if (m ==12) {
			System.out.println("15000");
		}else {
			System.out.println("Error");
		}
		sc.close();

	}

}

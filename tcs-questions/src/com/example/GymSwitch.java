package com.example;

import java.util.Scanner;

public class GymSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int m = sc.nextInt();
		
		if (m<0) {
			System.out.println("invalid input");
		}else {
		
		switch(m){
			case 0:
				System.out.println("0");
				break;
			case 1:
				System.out.println("2000");
				break;
				
			case 2:
				System.out.println("5000");
				break;
			
			case 3:
				System.out.println("5000");
				break;
			case 4:
				System.out.println("9000");
				break;
			case 5:
				System.out.println("9000");
				break;
				
			case 6:
				System.out.println("9000");
				break;
				
			case 9:
				System.out.println("12000");
				break;
				
			case 12:
				System.out.println("15000");
				break;
				
			default:
				System.out.println("error");
				break;
				
		}
		}
		sc.close();
	}

}

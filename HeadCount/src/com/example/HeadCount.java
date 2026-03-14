package com.example;

import java.util.Scanner;

public class HeadCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Head Count");
		int heads = sc.nextInt();
	
		System.out.println("Enter the leg Count");
		int leg = sc.nextInt();
		
		// cats+rabbits =heads
		// cats = heads - rabbit
		// cats+2rabbits = legs
		// rabbits = (legs - 2 * heads)/2;	
		int rabbits = (leg-2*heads)/2;
		System.out.println("Rabbits =" +rabbits);
		int cats = heads-rabbits;
		System.out.println("Cats=" +cats);
		sc.close();
	}

}

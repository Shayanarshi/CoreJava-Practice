package com.example;
import java.util.Scanner;
import java.util.Random;
public class Guess {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Enter a number Between 0 to 9");
			num = sc.nextInt();
		}
		while(num<0 || num>9);
		
		// generate a random number
		
		
		Random rand = new Random();
		int x = rand.nextInt(10);
		
		if (num == x) {
			System.out.println("Your Number "+ num);
			System.out.println("System Number "+ x);
			System.out.println("Yes,You Guessed it!");
		}else {
			System.out.println("Your Number "+ num);
			System.out.println("System Number "+ x);
			System.out.println("Your Guess is Wrong");
		}
		sc.close();
	}

}

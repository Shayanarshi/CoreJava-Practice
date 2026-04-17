package com.example;

import java.util.Scanner;

public class PrintOnConsole {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter  any value:");
	 String input = sc.nextLine();
	 System.out.println("You Entered :" + input);
	 sc.close();
	}

}

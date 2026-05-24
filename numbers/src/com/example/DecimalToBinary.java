package com.example;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to convert");
		int number = input.nextInt();
		decimalToBinary(number);
		input.close();
	}
	private static void decimalToBinary(int number) {
		int temp = number;
		while(temp>0) {
		int digit = temp %2;
		temp = temp/10;
		}
		System.out.println(temp);
	}

}

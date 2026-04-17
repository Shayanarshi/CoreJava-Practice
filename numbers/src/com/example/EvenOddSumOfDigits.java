//Find the sum of even position digits and odd position digits separately.
package com.example;
import java.util.Scanner;

public class EvenOddSumOfDigits{
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit:");
		int num = sc.nextInt();
		printEvenOddSum(num);
		sc.close();
	}
	private static void printEvenOddSum(int num) {
		
		int count = 0;
		int temp = num;
		
		while (temp>0) {
			temp = temp/10;
			count ++;
		} 
		
		// Using String
		/*String str = String.valueOf(num);
		int count = str.length();
		*/
		
		int position;
		if (count % 2 == 0) {
			position =0;
		}else {
			position = 1;
		}
		int evenSum =0;
		int oddSum =0;
		while (num>0) {
			int digit = num % 10;
			if (position == 0) {
				evenSum = evenSum + digit;
				position = 1;
			}else {
				oddSum = oddSum+digit;
				position = 0;
			}
			num = num/10;	
		}
		System.out.println("The value of evenSum "+ evenSum);
		System.out.println("The value of oddSum "+ oddSum);
	}
}
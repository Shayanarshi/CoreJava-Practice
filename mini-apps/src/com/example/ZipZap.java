/* 
 * The program has to accept an integer from a user and  
 * then it should do the following. 
 *  1. if the integer is divisible by 3 then display "Zip" 
 *  2. if the integer is divisible by 5 then display "Zap" 
 *  3. if the integer is divisible by 3 and 5 then display "Rar" 
 *  4. Otherwise, display "Jar" 
 */

package com.example;

import java.util.Scanner;

public class ZipZap {

	public static void main(String[] args) {
		System.out.println("Please Enter a Number:");
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		
		
		if(number % 3 == 0 && number % 5 == 0){
			System.out.println("Rar");
		}else if(number % 3 == 0) {
			System.out.println("Zip");
		} else if(number % 5 == 0)
		{
			System.out.println("Zap");
		}
		else {
			System.out.println("Jar");
		}
		sc.close();
	}

}

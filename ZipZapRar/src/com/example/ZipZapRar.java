package com.example;

import java.util.Scanner;

public class ZipZapRar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.err.println("Please enter a value in digit:");
		int number = sc.nextInt();
		
		if(number % 3 ==0  && number %5 == 0){
			System.out.println("Rar"); 
		}else if (number % 3 == 0 ){
			System.out.println("Zip");
		}else if (number % 5== 0){
		System.out.println("Zap");
		} else {
		System.out.println("Jar");
		}
		sc.close();
	}
}

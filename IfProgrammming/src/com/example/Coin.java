/* 
 * This program has to accept a paise value as input and should 
 * display the output like below. 
 * ex: input = 287 
 * output: 
 *     rupees = 2 
 *     fifty paise = 1 
 *     twenty paise = 1 
 *     ten paise = 1 
 *     one paise = 7 
 *      
 */ 

package com.example;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please Enter the Paise");
		int paise = sc.nextInt();
		
		int r =0, fty = 0,twy =0 , ten =0, one =0;
		 
		if(paise>=100) {
			r= paise/100;
			paise =paise %100;
		}
		if (paise<100) {
			fty = paise/50;
			paise = paise%50;
		}
		if (paise<50) {
			twy=paise /20;
			paise = paise%20;
		}
		if(paise<20) {
			ten=paise /10;
			paise = paise%10;
		} 
		one = paise;
		 System.out.println("Rupees : " + r); 
		  System.out.println("Fifty paise : " + fty); 
		  System.out.println("Twenty paise : " + twy); 
		  System.out.println("Ten paise : " + ten); 
		  System.out.println("One paise : " + one); 
		     
		  sc.close();
	}

}

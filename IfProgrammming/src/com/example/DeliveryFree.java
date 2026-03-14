/** 
 * This program has to accept the distance (in kms) as input 
 * and should calculate the delivery fee as below. 
 * 1. for first 3 kms free delivery 
 * 2. for next 3 kms, Rs. 6 per km 
 * 3. for remaining kms, Rs. 12 per km 
 */ 
package com.example;

import java.util.Scanner;

public class DeliveryFree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the distance in Km");
		Scanner sc = new Scanner (System.in);
		int distance = sc.nextInt();
		double delhiveryFee = 0;

		if(distance<=3) {
			delhiveryFee = 0;
		}else if (distance<=6) {
			delhiveryFee = (distance-3)*6;
		}
			else {
				delhiveryFee = (3*6)+(distance-6)*12;
				
				
			
			}
		System.out.println("Delhivery Fee is :"+ delhiveryFee);
		sc.close();
			
		}
		
		
	}

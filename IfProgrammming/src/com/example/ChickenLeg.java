/*Assignment problem: 
Implement a program to find the number of rabbits and chickens in a farm. 
Given the number of heads and legs of the chickens and rabbits in a farm, 
identify and display the number of chickens and rabbits in the farm. 
If the given input cannot make a valid number of rabbits and chickens, 
then display an appropriate message. 
Sample input                        
Heads=150, legs=500                                                         
Heads=3, legs=11                  
*/
package com.example;

import java.util.Scanner;

public class ChickenLeg {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter thr number of Legs:");
	int legs = sc.nextInt();
	
	System.out.println("Enter the number of Heads:");
	int head = sc.nextInt();
	
	if(legs % 2 !=0 ||legs<2*head ||legs > 4* head ) {
		System.out.println("Invalid input. Cannot determine animals");
	}
	else {
	
	int rabbit = (legs/2) - head;
	int chicken = head-rabbit;
	
	System.out.println("The number of Rabbits: "+ rabbit);
	System.out.println("The number of Chickens  "+chicken);
	}
	 sc.close();
	}

}

package com.example;

import java.util.Scanner;

public class SecondMaxElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of an Array");
		for (int i =0 ; i<size; i++) {
			arr [i] = sc.nextInt();
		}
		int result = findSecondMaxElement(size,arr);
		System.out.println("The Smax Element is " + result);
		sc.close();

	}
	private static int findSecondMaxElement(int size,int arr[]) {
		
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		
		for(int element : arr) {
			
			if(element>max) {
				smax = max; // 4
				max = element;  // 9				
			}else if (element!= max && element>smax) {
				smax = element;
			}
		}
		return smax;
	}

}

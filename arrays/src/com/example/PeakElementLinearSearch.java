
// need to work on logic 
package com.example;

import java.util.Scanner;

public class PeakElementLinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number Elements of an Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of an Array");
		for (int index = 0; index<size; index++) {
			arr[index] = sc.nextInt();
		}
		int peak = peakElement(size,arr);
		if(peak!= -1) {
			System.out.println("Peak Element found:" + peak);
		}else {
			System.out.println("Peak Elements not found.");
		}
		sc.close();
	}
	private static int peakElement(int size, int arr[]) {
		for (int i = 0; i <size;i++) {
			boolean left = (i == 0 || arr[i-1] < arr[i]);
			boolean right = (i==size-1 || arr[i]>arr[i+1]);
			
			if(left && right) {
				return arr[i];
			}
		}
		return -1;
	}
}

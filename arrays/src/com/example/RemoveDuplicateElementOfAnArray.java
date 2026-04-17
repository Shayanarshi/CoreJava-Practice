 package com.example;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicateElementOfAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Element of an Array");
		int size = sc.nextInt();
		int arr[] = new int [size];
		
		System.out.println("Enter the elements of an Array");
		for (int i =0; i<size;i++) {
			arr[i] = sc .nextInt();
		}
		int [] result= removeDuplicateElementOfAnArray(arr);
		System.out.println("The Array before removing duplicate element");
		System.out.println(Arrays.toString(arr));
		System.out.println("The Array after removing duplicate element  ");
		System.out.println(Arrays.toString(result));
		sc.close();	
	}
	private static int [] removeDuplicateElementOfAnArray(int arr[]) {
		
		int [] brr = new int [arr.length];
		brr[0] = arr[0]; // copy first element as it is 
		int index =1;
		// check for duplicate
		for (int i =0; i<arr.length;i++) {
			boolean flag = false;
			for(int j =0; j<index;j++) {
				if(brr[j] == arr[i]) {
					flag = true;
					break;
				}
			}
			// distinct 
			if(flag == false) {
				brr[index] =arr[i];
				index++;
			}
		} 
		// printing results
		int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = brr[i];
        }
		return result;
	}
}

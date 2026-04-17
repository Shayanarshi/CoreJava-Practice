package com.example;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDupUsingHashSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Element of an Array");
		int size = sc.nextInt();
		int arr[] = new int [size];
		
		System.out.println("Enter the elements of an Array");
		for (int i =0; i<size;i++) {
			arr[i] = sc .nextInt();
		}
		removeDuplicate(arr);
		sc.close();
	}
	private static void removeDuplicate(int arr []) {
		LinkedHashSet<Integer> set  = new LinkedHashSet<Integer>();
		for(int i = 0 ; i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println("The Given Array " + Arrays.toString(arr));
		System.out.println("After Removing Duplicate Element " + set);
		
	}

}

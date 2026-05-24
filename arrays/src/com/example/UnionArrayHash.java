package com.example;

import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class
UnionArrayHash {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of an Element of An Array1");
		int size1 = sc.nextInt();
		// array creation
		int [] arr1 = new int[size1];
		System.out.println("Enter the Elements of an Array 1");
		for(int i =0; i<size1;i++) {
			arr1[i] = sc.nextInt();
		}
		// array 2
		System.out.println("Enter the number of an Element of An Array2");
		int size2 = sc.nextInt();
		int [] arr2 = new int[size2];
		System.out.println("Enter the Elements of an Array 2");
		for(int i =0; i<size2;i++) {
			arr2[i] = sc.nextInt();	
			}
		findUnion(arr1,arr2);
		sc.close();
	}
	private static void findUnion(int arr1[], int arr2[]) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int element : arr1) {
			set.add(element);
		}
		for (int element : arr2) {
			set.add(element);
		}
		System.out.println("The Given Element of Array1 is ");
		System.out.println(Arrays.toString(arr1));
		System.out.println("The given Element of Array2 is");
		System.out.println(Arrays.toString(arr2));
		System.out.println("The Union of Arr1 and Arr2 is ");
		System.out.println(set);
	}
}

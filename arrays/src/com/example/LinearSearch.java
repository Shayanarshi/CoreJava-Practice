package com.example;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Taking Size of an Array from the User
		System.out.println("Enter the Size of an Array you want:");
		int size = sc.nextInt();
		int arr [] = new int [size];
		// values of elements of an array.
		System.out.println("Enter the Elements of an Array:");
		for (int i = 0;i<size; i++) {
			arr[i] = sc.nextInt();
		}
		// to find 
		System.out.println("Enter the Digit You Wanna Search:");
		int key = sc.nextInt();
		boolean flag = linearSearch(arr,key);
		if(flag) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		sc.close();
	}
	
	private static boolean linearSearch( int arr[],int key) {
		
		boolean found = false;
		
		for (int i =0; i<arr.length;i++) {
			if(arr[i] == key) {
				found = true;
				break;
			}
		}
		return found;		
	}

}

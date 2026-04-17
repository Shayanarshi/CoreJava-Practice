package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinSmaxSmin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of an Array");

		for (int i =0; i<size;i++) {
			arr[i] = sc.nextInt();	
		}
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length-1;
		while (left<=right) {
			if(left != right) {
				System.out.print(arr[right--]);
				System.out.print(arr[left++]);	
			}else {
				System.out.print(arr[left++]);
			}
		}
		sc.close();
		
	}
}










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
		int result []= new int[size];
		int left = 0;
		int right = arr.length-1;
		int k =0;
		while (left<=right) {
			if(left != right) {
				result[k++]=arr[right--];
				result[k++] = arr[left++];
			}else {
				result[k++] = arr[left++];
			}
		}
		System.out.println("Output Array:");
		System.out.println(Arrays.toString(result));
		sc.close();
		
	}
}










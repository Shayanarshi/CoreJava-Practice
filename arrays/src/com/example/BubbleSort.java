package com.example;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Elements");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the Elements of an Array");
		for (int i =0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Element of an Array Before Sorting" + Arrays.toString(arr));
		findBubbleSort(arr);
		System.out.println("Element of an Array After Sorting" + Arrays.toString(arr));
		sc.close();
	}
	private static void findBubbleSort(int arr[]) {
		
		for (int i =1;i<arr.length;i++){
			
			for (int j=0; j<=arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}	
	}
	
}

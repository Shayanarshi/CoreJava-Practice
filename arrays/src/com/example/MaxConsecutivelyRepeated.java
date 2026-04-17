package com.example;
import java.util.Scanner;
public class MaxConsecutivelyRepeated {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of an Array");
		for (int i =0 ; i<size; i++) {
			arr [i] = sc.nextInt();
		}
		findMaxConsecutivelyRepeated(arr);
		sc.close();
	}
	
	private static void findMaxConsecutivelyRepeated(int arr[]) {
		int count =1;
		int max = 0;
		int element = arr[0];
		for(int i =0;i<arr.length-1;i++) {
			
			if(arr[i] == arr[i+1]) {
				count ++; 
			}else {
				count = 1;
			}
			if(count > max) {
				max=count;
				element = arr[i];
			}	
		}	
		System.out.println("The Element " + element + " is max consecutively repeated for: "+ max+" times.");
	}
}

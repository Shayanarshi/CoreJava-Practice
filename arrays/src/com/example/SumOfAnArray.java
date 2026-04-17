package com.example;
import java.util.Scanner;
public class SumOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array:");
		int size = sc.nextInt();
		int [] arr = new int [size];
		
		
		System.out.println("Enter the elements of an Array:");
		for(int index = 0;index<size; index++) {
			arr[index]= sc.nextInt();
		}
		int result = sumOfAnArray(size,arr);
		System.out.println("The sum is: " + result);
		sc.close();
		
		// using 1 method only
		/**int sum = 0 ;
		for(int index = 0 ;index <size; index ++) {
			sum = sum + arr[index];
		}
		System.out.println("The sum is " + sum);
		sc.close();
		**/
		
	}
	 //    using second method ie. two different methods.
	private static int sumOfAnArray(int size,int arr []) {
		
		int sum = 0 ;
		for(int index = 0 ;index <size; index ++) {
			sum = sum + arr[index];
		}
		return sum;
	}
}

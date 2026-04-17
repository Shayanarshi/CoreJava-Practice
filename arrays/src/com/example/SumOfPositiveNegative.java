package com.example;
import java.util.Scanner;
public class SumOfPositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array You Want:");
		int size = sc.nextInt();
		int arr[] = new int [size];

		System.out.println("Enter the elemets of an Array:");
		for (int index = 0 ; index<size; index++) {
			arr [index] = sc.nextInt();
		}
		postiveAndNegative(size,arr);
		sc.close();
	}
	private static void postiveAndNegative(int size,int arr[]) {
		int positiveSum=0;
		int negativeSum = 0;
		for (int index = 0 ; index<size; index ++) {
			
			if (arr[index]>=0) {
				positiveSum = positiveSum + arr[index];
			}else {
				negativeSum = negativeSum+ arr[index];
			}	
		}
		System.out.println("Positive Sum: " + positiveSum);
		System.out.println("Negative Sum: " + negativeSum);
	}

}

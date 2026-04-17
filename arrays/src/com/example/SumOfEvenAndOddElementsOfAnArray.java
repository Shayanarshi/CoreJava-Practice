package com.example;
import java.util.Scanner;
public class SumOfEvenAndOddElementsOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array You Want:");
		int size = sc.nextInt();
		int arr[] = new int [size];

		System.out.println("Enter the elemets of an Array:");
		for (int index = 0 ; index<size; index++) {
			arr [index] = sc.nextInt();
		}
		evenOddSumOfAnArray(size,arr);
		sc.close();
	}
	private static void evenOddSumOfAnArray(int size,int arr[]) {
		int evenSum=0;
		int oddSum = 0;
		for (int index = 0 ; index<size; index ++) {
			
			if (arr[index] % 2 == 0) {
				evenSum = evenSum + arr[index];
			}else {
				oddSum = oddSum+ arr[index];
			}	
		}
		System.out.println("Even Sum: " + evenSum);
		System.out.println("Odd Sum: " + oddSum);
	}

}

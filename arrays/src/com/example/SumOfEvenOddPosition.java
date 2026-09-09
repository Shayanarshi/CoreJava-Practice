package com.example;
import java.util.Scanner;
public class SumOfEvenOddPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array you want:");
		int size = sc.nextInt();
		int arr[] = new int[size];


		System.out.println("Enter the Elements of an Array:");
		for (int index = 0; index < size; index++) {
			arr[index] = sc.nextInt();
		}
		sumOfEvenOddPosition(size, arr);
		sc.close();
	}
	private static void sumOfEvenOddPosition(int size, int arr[]) {
		
		int evenPosition = 0;
		int oddPosition =0;
		
		
		for (int index = 0 ; index< arr.length; index++) {
			if ((index) % 2 == 0) {
				evenPosition += arr[index];
			}else {
				oddPosition += arr [index];
			}
		
		}
		System.out.println("The sum of EvenPosition Elements: " + evenPosition);
		System.out.println("The sum of oddPosition Elements: " + oddPosition);
		
	}

}

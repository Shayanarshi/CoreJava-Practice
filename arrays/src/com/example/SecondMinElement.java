package com.example;
import java.util.Scanner;

public class SecondMinElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Element of an Array");
		int size = sc.nextInt();
		int arr[] = new int [size];
		
		System.out.println("Enter the elements of an Array");
		for (int i =0; i<size;i++) {
			arr[i] = sc .nextInt();
		}
		int result= secondMinElement(size,arr);
		System.out.println("The smin element is "+ result);
		sc.close();
	}
	private static int secondMinElement(int size,int arr[]) {
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		for (int element : arr) { 
			if(element < min) {
				smin = min;
				min= element;
			}else if (element != min && element <smin) {	
				smin = element;
			}
		}
		return smin;
	}

}

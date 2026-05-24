package com.example;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySerach {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number Elements of an Array:");
	int size = sc.nextInt();
	int arr[] = new int[size];
	
	System.out.println("Enter the elements of an Array");
	for (int i = 0; i<size; i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter the Element to be Searched ");
	int target = sc.nextInt();
	
	boolean flag = binarySearch(size,arr,target);
	if(flag) {
		System.out.println("Elemets Found.");
	}else {
		System.out.println("Elements not found.");
	}
	sc.close();
	}
	private static boolean binarySearch( int size,int arr[], int target) {
		
		int low = 0;
		int high = size-1;
		
		Arrays.sort(arr);
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(mid==target) {
				return true;
			}else if (target<mid) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return false;
	}
}

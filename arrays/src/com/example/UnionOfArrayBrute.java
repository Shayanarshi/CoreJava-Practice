package com.example;
import java.util.Arrays;
import java.util.Scanner;
public class UnionOfArrayBrute{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of an Element of An Array1");
		int size1 = sc.nextInt();
		// array creation
		int [] arr1 = new int[size1];
		System.out.println("Enter the Elements of an Array 1");
		for(int i =0; i<size1;i++) {
			arr1[i] = sc.nextInt();
		}
		// array 2
		System.out.println("Enter the number of an Element of An Array2");
		int size2 = sc.nextInt();
		int [] arr2 = new int[size2];
		System.out.println("Enter the Elements of an Array 2");
		for(int i =0; i<size2;i++) {
			arr2[i] = sc.nextInt();	
			}
		findUnion(arr1,arr2);
		sc.close();
		}
	private static void findUnion(int arr1[], int arr2[]) {
		int [] arr3 = new int[arr1.length+arr2.length];
		// copy the first element 
		arr3[0] = arr1[0];
		int index = 1;
		// checking duplicate for the arr1
		for(int i = 1 ; i<arr1.length;i++) { ///  need to check 
			boolean flag = false;
			for(int j=0;j<index; j++) {
				if(arr3[j] == arr1[i]) {
					flag = true;
					break;
				}
			}
			if (flag ==false) {
				arr3[index] = arr1[i];
				index++;
			}
		}
		// check duplicate for arr2 
		for (int i =0 ; i<arr2.length;i++) {
			boolean flag = false;
			for (int j=0; j<index;j++) {
				if(arr3[j]==arr2[i]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				arr3[index] = arr2[i];
						index++;
			}
			
		}
		
		System.out.println("Given Array1 : " + Arrays.toString(arr1));
		System.out.println("Given Array2 :" + Arrays.toString(arr2));
		System.out.println("Union of Arrays:");

		for(int i = 0; i < index; i++) {
		    System.out.print(arr3[i] + " ");
		}
	}

}
package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number of rows Matrix A");
	int rows = sc.nextInt();
	System.out.println("Enter the number of columns Matrix A");
	int colns = sc.nextInt();
	int A [][] = new int [rows][colns];
	System.out.println("enter the elements matrix A");
	for (int i = 0; i<A.length;i++) {
		for (int j =0; j<A[0].length;j++) {
			A [i] [j] = sc.nextInt();
		}
	}
	System.out.println("Enter the number of rows Matrix B");
	int rows2 = sc.nextInt();
	System.out.println("Enter the number of columns Matrix B");
	int colns2 = sc.nextInt();
	
	int B [][] = new int [rows2][colns2];
	
	System.out.println("enter the elements matrix B");
	
	for (int i = 0; i<B.length;i++) {
		for (int j =0; j<B[0].length;j++) {
			 B[i] [j] = sc.nextInt();
		}
	}
	if(A.length == B.length  && A[0].length == B[0].length) {
		int [][]C= findAddition(A,B);
		System.out.println("The elements of Matrix A "+ Arrays.deepToString(A));
		System.out.println("The elements of Matrix B "+ Arrays.deepToString(B));
		System.out.println("The elements of Matrix C "+ Arrays.deepToString(C));	
	}
	else {
		System.out.println("Can not be Added  ERROR");
		}
		sc.close();
	}
	private static int [] [] findAddition (int A [][], int B[][]) {
		
		int C [][] = new int [A.length][B[0].length];
		
		for ( int i =0;i<A.length;i++) {
			for (int j =0;j<B[0].length;j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		return C;
	}

}

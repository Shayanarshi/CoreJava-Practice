package com.example;

import java.util.Scanner;

public class SumOFLeftDiagonalRightDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int columns = sc.nextInt();
		
		int matrix [][] = new int [rows][columns];
		
		System.out.println("Enter the elements");
		
		for (int i =0 ; i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				matrix [i][j] = sc.nextInt();
			}
		}
		findSum(matrix);
		sc.close();
	}
	private static void findSum(int matrix[][]) {
		int leftDiagonalSum= 0;
		int rightDiagonalSum = 0;
		
		for(int i = 0; i < matrix.length; i++) {
	        for(int j = 0; j < matrix[i].length; j++) {
		
	     if(i==j) {
			leftDiagonalSum += matrix[i][j];
		}
		
		if(i+j == matrix.length-1) {
			rightDiagonalSum+= matrix[i][j];
		}
	  }
	}
		System.out.println("left Diagonal Sum "+ leftDiagonalSum);
		System.out.println("right Diagonal Sum "+ rightDiagonalSum);
	}
}

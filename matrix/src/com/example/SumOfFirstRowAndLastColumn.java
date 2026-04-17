package com.example;

import java.util.Scanner;

public class SumOfFirstRowAndLastColumn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of Column");
		int columns = sc.nextInt();
		int matrix [][] = new int [rows][columns];
		System.out.println("Enter the number of Elements");
		
		for (int i =0; i<matrix.length;i++) {
			for(int j =0; j<matrix[i].length;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int result = findSum(matrix);
		System.out.println("The sum  of first row and last column "+result);
		sc.close();
	}
	private static int findSum(int[][]matrix) {
		int sum =0;
		
		for(int i =0;i<matrix[0].length;i++) {
			sum+= matrix[0][i];
			}
		for(int i =1;i<matrix.length;i++) {
			sum+= matrix[i][matrix[0].length-1];
			}
		
		return sum;
		}
		
		
	}

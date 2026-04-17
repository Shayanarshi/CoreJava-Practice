package com.example;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
	 int A [][] = {
		 {2,9,3},
		 {1,4,5} 
	 };
	 int B [][] = { 
			 {7,3,1},
			 {1,0,4,},
			 {5,4,3}
	 };
	 
	 if(A[0].length == B.length) {
		 int C [][] = findMultiply(A,B);
		 System.out.println("The matrix A is "+ Arrays.deepToString(A));
		 System.out.println("The matrix B is "+ Arrays.deepToString(B));
		 System.out.println("The matrix C is "+ Arrays.deepToString(C));
	 }else {
		 System.out.println("Error");
	 }
	}
	
	private static int [][] findMultiply(int A[][],int B[][]){
		int C [][] = new int [A.length] [B[0].length];
		for (int i =0; i<C.length;i++) {
			for(int j=0; j<C[0].length;j++) {
				C[i][j] = 0;
				
				for(int k=0;k<B.length;k++) {
				C[i][j] += A[i][k] * B[k][j]; 
				}	
			}
		}
		return C;
		
	}

}

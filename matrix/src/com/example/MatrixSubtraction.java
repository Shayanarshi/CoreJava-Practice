package com.example;

import java.util.Arrays;

public class MatrixSubtraction {

	public static void main(String[] args) {
	 int A [] [] = {
			 {2,5,6},
			 {2,1,3}
	 };
	  int B [][] = {
			  {6,1,8}, 
			  {3,1,8}
	  };
	  if(A.length == B.length && A[0].length== B[0].length) {
		  int [][] C = findSubtraction(A,B); // create method
		  System.out.println("Matrix A "+ Arrays.deepToString(A));
		  System.out.println("Matrix B "+ Arrays.deepToString(B));
		  System.out.println("Matrix C "+ Arrays.deepToString(C));
	  }else {
		  System.out.println("Error ");
	  }
	}
	
	private static int [][] findSubtraction(int A[][], int B[][]){
		int C [][] = new int [A.length] [B[0].length];
		for (int i =0; i<A.length;i++) {
			for (int j =0; j<B[0].length;j++) {
				C [i][j] =B[i] [j] - A[i][j];
			}
		}
		return C;
	}

}

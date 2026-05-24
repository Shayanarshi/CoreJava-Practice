package com.example;
import java.util.ArrayList;

public class SpiralOrder {
    public static void main(String[] args) {
        int [][] matrix = {

                {1,2,3,4},
                {5,6,7,8},
                {9,0,1,2},
                {3,4,5,6},
                {7,8,9,0}
        };
         findSpiral(matrix);
    }
    private static void findSpiral(int [][]matrix){

        int n = matrix.length; // rows
        int m = matrix[0].length; // columns

        int top =0;
        int left =0;
        int right = m-1;
        int bottom = n-1;


        ArrayList<Integer> list= new ArrayList<Integer>();
        while(top<=bottom && left<=right){

            for(int i =left; i<=right; i++) // left to right
                list.add(matrix[top][i]);
            top ++;

            for(int i = top;i<=bottom;i++) //
                list.add(matrix[i][right]);
            right --;

            if(top<=bottom) {    //
                for (int i = right; i >= left; i--)
                    list.add(matrix [bottom][i]);
                bottom--;
            }

                if(left<=right){  //

                    for (int i =bottom ;i>=top; i--)
                        list.add(matrix[i][left]);
                        left++;
                }

        }
        System.out.println(list);
    }
}

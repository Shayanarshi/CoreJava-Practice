package com.example;

public class ThreeDArray {
    public static void main(String[] args) {
        int [][][] arr = {
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {0,1,2},
                        {3,4,5}
                },
                {
                        {6,3,9},
                        {2,9,5}
                }
        };
        //printing part
        // outher loop
        for(int i=0;i<arr.length;i++){
            // middle
            for(int j=0;j<arr[i].length;j++){
                // inner
                for(int k =0;k<arr[i][j].length; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }
}

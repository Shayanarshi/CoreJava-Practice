package com.example;

import java.util.Arrays;

public class ThreeDArrayForEach {
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
        for(int [][] d2:arr){
            for(int[]d1:d2){
//                System.out.println(Arrays.toString(d1)); we can use this and skip 1 more for loop
                for(int element:d1){
                    System.out.print(element+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

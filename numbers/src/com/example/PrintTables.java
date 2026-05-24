package com.example;
import java.util.Scanner;
class PrintTable{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to print Table");
        int n = sc.nextInt();
        printTable(n);
        sc.close();
    }
    private static void printTable(int n){
        System.out.println("Table of "+n);
        for(int i=1;i<=10;i++){

            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

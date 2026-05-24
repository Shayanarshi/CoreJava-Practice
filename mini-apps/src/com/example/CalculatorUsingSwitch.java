package com.example;

import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        System.out.println("Menu");
        System.out.println("1. Addition\n"+"2.Subtraction\n"+  "3. Multiplication\n"+ "4.Division\n");
        System.out.println("Enter your Choice:");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Addition " + (a+b));
                break;
            case 2:
                System.out.println("Subtraction " +  (a-b));
                break;

            case 3:
                System.out.println("Multiplication " + (a*b));
                break;
            case 4:
                System.out.println("division " + (a/b));
                break;

            default:
                System.out.println("Invalid Select ,Please select the options from Menu");
        }
        sc.close();


    }

}

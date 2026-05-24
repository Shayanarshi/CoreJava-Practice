package com.example;
import java.util.Scanner;
public class CalculatorUsingSwitch{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second  number");
        int b = sc.nextInt();
        System.out.println("Menu================= ");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("Select an option to perform");
        int x = sc.nextInt();

        switch(x){
            case 1:
                System.out.println("Addition of " +a +" and "+ b+ " is:"+ (a+b));
                break;
            case 2:
                System.out.println("Subtraction of " +a +" and "+ b+ " is:"+ (a-b));
                break;
            case 3:
                System.out.println("Multiplication of " +a +" and "+ b+ " is:"+ (a*b));
                break;
            case 4:
                System.out.println("Division of " +a +" and "+ b+ " is:"+ (a/b));
                break;

            default:
                System.out.println("Wrong Selection");
        }
    }
}
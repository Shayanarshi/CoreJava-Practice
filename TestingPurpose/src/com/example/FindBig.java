package com.example;

public class FindBig {

	public static void main(String[] args) {
		int a = 5 ,b= 15,c=7;
		if (a>b) {
			if (a>c) {
				System.out.println(a+ " is Big");
			}
		else {
			System.out.println(c+" is Big");
		}
	}
	else if (b>c) {
		System.out.println(b+ " is Big");
	}else{
	System.out.println(c+ " is big");
	}
}
}

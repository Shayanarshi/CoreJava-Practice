package com.example;

public class Explicit {
	public static void main(String []args) {
		double d = 100.5478;
		int a = (int)d;
		System.out.println("Double "+d + " is converted to int "+a);
		
		
		short s = 121;
		char ch = (char)s;
		System.out.println("short "+s + " is converted to char "+ch);
		
		
		byte b = 100;
		char ch2 = (char)b;
		System.out.println("byte "+b + " is converted to char "+ch2);
		
		
		
	}
	
}

package com.example;

public class Implicit {

	public static void main(String[] args) {
		byte x = 120;
		long y = x;
		System.out.println("Byte " + x +" is Converted to long " +y);
		
		char ch = 'a';
		int a = ch;
		System.out.println("Char "+ch +" is converted to int "+a);
		
		long l = 1024l;
		float f = l;
		System.out.println("long "+ l +" is converted into float"+f);
		
		char xy = 'Z';
		long p = xy;
		System.out.println("Char " +xy +" is converted to long "+ p);
		
		

	}

}

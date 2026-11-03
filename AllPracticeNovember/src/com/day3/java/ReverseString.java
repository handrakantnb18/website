package com.day3.java;

public class ReverseString {

	public static void main(String[] args) {

		// Reverse a String Using StringBuilder
		
		String str = "Chandrakant";

		String reverse = new StringBuilder(str).reverse().toString();

		System.out.println("Original String: " + str);
		System.out.println("Reverse String: " + reverse);

		
	}
}

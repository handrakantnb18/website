package com.day9.java;

// Write a Java program to reverse a string without using the StringBuilder or reverse() method

public class StringReverse {

	public static String reverseString(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}

	public static void main(String[] args) {

		String input = "Chandraakant";
		
		System.out.println("Reversed: " + reverseString(input));

	}
}

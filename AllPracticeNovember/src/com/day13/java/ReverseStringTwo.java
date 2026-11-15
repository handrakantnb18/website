package com.day13.java;

// Using for Loop Write a Java program to reverse a given string.

public class ReverseStringTwo {

	public static void main(String[] args) {

		String str = "Chandrakant bhosale";

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}

		System.out.println("Original String : " + str);
		System.out.println("Reverse String  : " + reverse);

	}
}

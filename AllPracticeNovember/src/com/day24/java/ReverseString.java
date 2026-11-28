package com.day24.java;

// Reverse a String without using built-in reverse()

public class ReverseString {

	public static void main(String[] args) {

		String str = "Sivraj";

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}

		System.out.println("Reverse: " + reverse);

	}
}

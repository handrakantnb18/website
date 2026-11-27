package com.day24.java;

// Check whether a String is a palindrome

public class Palindrome {

	public static void main(String[] args) {

		String str = "reer";

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		if (str.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}

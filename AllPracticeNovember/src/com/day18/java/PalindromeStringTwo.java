package com.day18.java;

//Using StringBuilder Determine if a given string is a palindrome

public class PalindromeStringTwo {

	public static void main(String[] args) {

		String str = "level";

		String reverse = new StringBuilder(str).reverse().toString();

		if (str.equals(reverse)) {

			System.out.println("Palindrome");

		} else {

			System.out.println("Not Palindrome");
		}

	}
}

package com.day13.java;

// Using Java 8 Streams Determine if a given string is a palindrome

public class PalindromeStringThree {

	public static void main(String[] args) {

		String str = "madam";

		boolean result = 
				str.equals(str.chars()
						.mapToObj(c -> String.valueOf
								((char) c))
						.reduce("", (a, b) -> b + a));

		System.out.println(result ? 
				"Palindrome" : 
					"Not Palindrome"
					);
	}
}

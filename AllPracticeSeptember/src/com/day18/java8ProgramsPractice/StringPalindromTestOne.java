package com.day18.java8ProgramsPractice;

// to check a palindrome is to reverse the string and compare it with the original string.

public class StringPalindromTestOne {

	public static boolean isPalindrom(String s) {
		s = s.toLowerCase();

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}

		return s.equals(rev);

	}

	public static void main(String[] args) {

		String s = "level";

		if (isPalindrom(s)) {
			System.out.println("\"" + s + "\" is a palindrom");

		} else {
			System.out.println("\"" + s + "\" is  not a palindrom");

		}
	}
}

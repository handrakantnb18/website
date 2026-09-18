package com.day18.java8ProgramsPractice;

// We initialize two pointers (i=0) from the start and (j = s.length -1) from the end.

public class StringPalindromTestTwo {

	public static boolean isPalindrome(String s) {

		s = s.toLowerCase();
		int i = 0, j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {

		String s1 = "chandrakant";
		String s2 = "Shivraj";

		System.out.println("\"" + s1 + "\" palindrome? " + isPalindrome(s1));
		System.out.println("\"" + s2 + "\" palindrome? " + isPalindrome(s2));

	}
}

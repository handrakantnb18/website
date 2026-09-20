package com.day20.java8ProgramsPractice;

//we use a two-pointer approach similar to iteration.

public class StringPalindromTestTwo {

	public static boolean isPalindrome(String s, int i, int j) {

		if (i >= j)
			return true;

		if (s.charAt(i) != s.charAt(j))
			return false;

		return isPalindrome(s, i + 1, j - 1);
	}

	public static void main(String[] args) {

		String s = "Racecar";
		s = s.toLowerCase();

		System.out.println(isPalindrome(s, 0, s.length() - 1));

	}

}

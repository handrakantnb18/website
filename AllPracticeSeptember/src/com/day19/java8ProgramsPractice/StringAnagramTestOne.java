package com.day19.java8ProgramsPractice;

import java.util.Arrays;

// Program to Check Two Strings Are Anagram Of Each Other in Java
// Program to check if two strings are anagrams Java using Sorting:

public class StringAnagramTestOne {

	static boolean areAnagram(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;

		if (n1 != n2)
			return false;

		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;

	}

	public static void main(String[] args) {

		char str1[] = { 't', 'e', 's', 't' };
		char str2[] = { 't', 't', 'e', 'w' };

		if (areAnagram(str1, str2))
			System.out.println("The two strings are" + " anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");

	}
}

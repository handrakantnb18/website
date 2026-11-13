package com.day9.java;

import java.util.Arrays;

// Write a Java program to check whether two strings are anagrams

public class AnagramCheck {

	public static boolean isAnagram(String s1, String s2) {
		
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
	}

}

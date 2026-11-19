package com.day16.java;

// Write a Java program to check if a vowel is present in a string

public class StringContainsVowels {

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

	public static void main(String[] args) {

		System.out.println(stringContainsVowels("Hello"));
		System.out.println(stringContainsVowels("TV"));

	}
}

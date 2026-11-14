package com.day9.java;

// Write a Java program to count the number of vowels in a string

public class VowelCounter {

	public static int countVowels(String str) {
		int count = 0;
		for (char ch : str.toLowerCase().toCharArray()) {
			
			if ("aeiou".indexOf(ch) != -1)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		String str = "chandrakant bhosale";
		
		System.out.println("Number of vowels: " + countVowels(str));
	}

}

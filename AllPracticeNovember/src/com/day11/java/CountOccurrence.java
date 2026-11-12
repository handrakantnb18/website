package com.day11.java;

//Count occurrence of a given character in a string using Stream API in Java

public class CountOccurrence {

	public static long count(String s, char ch) {
		return s.chars()
				.filter(c -> c == ch)
				.count();
	}

	public static void main(String[] args) {

		String str = "chandrakantbhosale";
		char c = 'a';
		System.out.println(count(str, c));
		
	}
	
}

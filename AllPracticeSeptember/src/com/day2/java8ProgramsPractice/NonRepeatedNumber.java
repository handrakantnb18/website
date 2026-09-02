package com.day2.java8ProgramsPractice;

public class NonRepeatedNumber {

	// Find the first non-repeated character in a String
	public static void main(String[] args) {
		
		String str = "Swiss";
		
		Character result = 
				str.chars()
				.mapToObj(c -> (char)c)
				.filter(c -> str.indexOf(c) == str.lastIndexOf(c))
				.findFirst()
				.orElse(null);
		
		System.out.println(result);
		
		
	}
}

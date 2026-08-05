package com.day4.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestString {

	public static void main(String[] args) {
		
		// find Largest String in the Arrays of list
		
		List<String> str = Arrays.asList("chandrakant", "Ram",
				"priyanka", "Shivraj", "Bhosale", "vijay"); 
		
		String largest =
				str.stream()
				.max(Comparator.comparing(String::length))
				.get();
		
		System.out.println(largest);
	}
}

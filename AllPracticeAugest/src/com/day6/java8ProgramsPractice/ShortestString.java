package com.day6.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortestString {

	// find smallest String in the Arrays of list

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"Softwareckjkjdjcnj","chandrakantiucfjoj","Priyanka", "Shivraj");
		
		String sm = 
				str.stream()
				.min(Comparator.comparing(String::length))
				.get();
		
		System.out.println(sm);
		
	}
}

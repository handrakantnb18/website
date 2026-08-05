package com.day4.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SmallString {

	// find smallest String in the Arrays of list
	
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("chandrakant", "Ram",
				"priyanka", "Shivraj", "Bhosale", "vijay"); 
		
		String smal = 
				str.stream()
				.min(Comparator.comparing(String::length))
				.get();
		
		System.out.println(smal);
		
	}
}

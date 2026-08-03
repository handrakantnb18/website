package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortestString {

	// find smallest String in the Arrays of list
	
	public static void main(String[] args) {  
		
		List<String> str = Arrays.asList(
				"Software","chandrakant","Priyanka", "Shivraj");
		
		String smallest = 
				str.stream()
				.min(Comparator.comparing(String::length))
				.get();
		
		System.out.println(smallest);
		
	}
}

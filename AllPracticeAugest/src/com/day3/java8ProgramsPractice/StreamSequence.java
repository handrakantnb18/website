package com.day3.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class StreamSequence {

	// Print All Elements
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"Pooja","Amit","Ram","Shyam");
		
		str.stream()
		.forEach(System.out::println);
		
	}
}

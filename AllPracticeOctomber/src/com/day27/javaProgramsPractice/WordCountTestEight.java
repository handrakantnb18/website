package com.day27.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// How to count the number of occurrences of a given 
// word in a list of strings using Java 8

public class WordCountTestEight {

	public static void main(String[] args) {

		List<String> strings = 
				Arrays.asList("chandraakant scala ruby", "chandraakant "
						+ "react spring chandraakant chandraakant");
		
		String word = "chandraakant";
		
		long count = strings.stream()
				.flatMap(s -> Arrays.stream
						(s.split(" ")))
				.filter(w -> w.equals(word))
				.count();
		
		System.out.println("Occurrences of \"" + word + "\": " + count);

	}
}

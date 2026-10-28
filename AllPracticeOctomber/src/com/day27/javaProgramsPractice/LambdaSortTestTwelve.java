package com.day27.javaProgramsPractice;

import java.util.*;

// How to sort a list of strings by length using Lambda expressions

public class LambdaSortTestTwelve {

	public static void sortByLength(List<String> list) {
		
		Collections.sort(list, (a, b) -> 
		Integer.compare(a.length(), b.length()));
	}

	public static void main(String[] args) {

		List<String> names = 
				Arrays.asList("java", "scala", "javascript", "ruby");
		
		sortByLength(names);
		
		System.out.println(names);

	}
}

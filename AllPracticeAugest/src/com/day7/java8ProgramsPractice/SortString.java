package com.day7.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortString {

	public static void main(String[] args) {
		
		List<String> s = Arrays.asList(
				"chandrakant", "priyanka", "Shivraj","Ram","David");
		
		String string =
				s.stream()
				.min(Comparator.comparing(String::length))
				.get();
		
		System.out.println(string);
	}
}

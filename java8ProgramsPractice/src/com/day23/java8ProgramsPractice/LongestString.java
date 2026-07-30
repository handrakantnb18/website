package com.day23.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"chandrakant","Shivraj","Priyanka","Bhosale");
		
		String longest =
			str.stream()
			.max(Comparator.comparing(String::length))
			.get();
			
			System.out.println(longest);
			
	}
}

package com.day7.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringLongest {

	public static void main(String[] args) {
		
		// Find Longest String
				List<String> list = Arrays.asList(
						"chandrakant","Shivraj","Priyanka","Bhosale");
				
				String longt =
						list.stream()
						.max(Comparator.comparing(String::length))
						.get();
						
						System.out.println(longt);
				
	}
}

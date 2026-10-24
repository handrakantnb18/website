package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// 10. Check if any string in a list matches a condition

public class StringListTen {

	public static void main(String[] args) {
		
		List<String> items = 
				Arrays.asList("table", "chair", "bed");
		
		boolean hasBed = 
				items.stream()
				.anyMatch(item -> item.equals("bed"));
		
		System.out.println(hasBed);

	}
}

package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// 11. Find the first element of a stream

public class FindFirstElementEleven {

	public static void main(String[] args) {

		List<String> items = 
				Arrays.asList("First", "Second", "Third");

		String first = 
				items.stream()
				.findFirst()
				.orElse("Empty");
		
		System.out.println("Find First : "+first);
		
		String first1 = 
				items.stream()
				.skip(1)
				.findFirst()
				.orElse("Empty");
		
		System.out.println("Find First skip : "+first1);

	}
}

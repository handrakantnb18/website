package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// 11. Find the first element of a stream

public class FindFirstElementEleven {

	public static void main(String[] args) {

		List<String> items = 
				Arrays.asList("First", "Second", "Third", "Four", "Fifth");

		String first = 
				items.stream()
				.findFirst()
				.orElse("Empty");
		
		System.out.println("Find First : "+first);
		
		String second = 
				items.stream()
				.skip(1)
				.findFirst()
				.orElse("Empty");
		
		System.out.println("Find First skip : "+second);
		
		String third = 
				items.stream()
				.skip(2)
				.findFirst()
				.orElse("Empty");
		
		System.out.println("Find Second skip : "+third);
		

		String fourth = 
				items.stream()
				.skip(3)
				.findFirst()
				.orElse("Empty");
		
		System.out.println("Find Third skip : "+fourth);
	
		
	}
}

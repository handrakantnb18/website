package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class CountElements {

	// Count Elements
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				55,67,89,23,41,25,97);
		
		long count  = 
				list.stream()
				.count();
		
		System.out.println(count);
	}
}

package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FindMinimum {

	// Find Maximum Number
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,95,35,25,35,44,65,88,25,66);
		
		Integer min = 
				list.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min);
		
	}
}

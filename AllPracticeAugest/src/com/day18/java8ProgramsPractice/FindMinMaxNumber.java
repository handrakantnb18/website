package com.day18.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinMaxNumber {

	// Find Maximum and Minimum Numbers in the list
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,65,25,45,28,39,91,44,66,55);
		
		Integer max =
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println("Maximum Numbers : "+max);
		
		Integer min =
				list.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println("Minimum Numbers : "+min);
		
	}
}

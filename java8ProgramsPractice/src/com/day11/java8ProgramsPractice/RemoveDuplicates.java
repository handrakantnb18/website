package com.day11.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		// Remove Duplicate Elements
		
		List<Integer> list = Arrays.asList(
				1,5,6,3,5,78,9,1,6);
		
		list.stream()
		.distinct()
		.forEach(System.out::println);

	}
}

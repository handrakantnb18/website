package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	// Remove Duplicate Elements
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				10,15,35,85,55,10,15,55,18,16);
		
		list.stream()
		.distinct()
		.forEach(System.out::println);
	}
}

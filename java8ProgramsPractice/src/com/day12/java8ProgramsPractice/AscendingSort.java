package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class AscendingSort {

	// Sort List Ascending
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				77,8,6,55,9,2,63,4,9,22,5,33);
		
		list.stream()
		.sorted()
		.forEach(System.out::println);
		
	}
}

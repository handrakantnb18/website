package com.day24.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,92,34,76,45,29,79,33,55,61);
		
		Integer max =
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(max);
		
	}
}

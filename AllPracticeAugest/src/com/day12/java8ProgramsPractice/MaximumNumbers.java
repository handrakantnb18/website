package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumNumbers {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				78,98,32,15,19,22,14,56,66,37);
		
		Integer max =
				num.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(max);
	}
}

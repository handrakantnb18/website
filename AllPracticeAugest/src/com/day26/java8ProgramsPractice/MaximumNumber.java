package com.day26.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumNumber {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(
				98,78,65,28,92,13,18,17,93,22,44,67);
		
		
		Integer max = list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(4)
				.findFirst()
				.get();
		
		System.out.println(max);
		
	}
}

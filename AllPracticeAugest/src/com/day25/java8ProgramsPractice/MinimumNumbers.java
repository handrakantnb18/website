package com.day25.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MinimumNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				98,78,65,28,92,13,18,17,93,22,44,67);
		
		Integer min =
				list.stream()
				.distinct()
				.sorted()
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(min);
	}
}

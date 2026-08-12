package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MinimumNumbers {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				10,8,78,98,32,15,19,22,14,56,66,37);
		
		Integer min =
				num.stream()
				.distinct()
				.sorted()
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(min);
	}
}

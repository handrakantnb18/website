package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FindMaximumNum {

	// Find Maximum Number
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				15,13,55,78,95,64,28,37,95,62);
		
		Integer max =
				num.stream()
				.max(Integer::compare)
				.get();
				
		System.out.println(max);
	}
}

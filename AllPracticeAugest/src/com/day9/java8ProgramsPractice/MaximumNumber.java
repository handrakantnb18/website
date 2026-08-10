package com.day9.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				15,25,45,85,88,35,66,12,92);
		
		Integer max =
				num.stream()
				.max(Integer::compareTo)
				.get();
		
		System.out.println(max);
	}
}

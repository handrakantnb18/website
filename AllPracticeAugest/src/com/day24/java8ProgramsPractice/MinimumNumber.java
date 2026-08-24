package com.day24.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MinimumNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				34,56,79,82,78,99,36,11,28);
		
		Integer min =
				list.stream()
				.distinct()
				.sorted()
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println("Minimum number is : "+min);
	}
}

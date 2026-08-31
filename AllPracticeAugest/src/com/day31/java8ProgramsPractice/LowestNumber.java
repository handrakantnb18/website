package com.day31.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				12,35,66,48,92,78,97,66,548,82,86,71);
		
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

package com.day4.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondSmallest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(110,255,235,789,56,
				78,95,62,14,25,72,92,33,55,64,19);
		
		Integer small =
				list.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(small);
	}
}

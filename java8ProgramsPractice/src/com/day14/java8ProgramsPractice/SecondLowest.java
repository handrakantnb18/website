package com.day14.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SecondLowest {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				78,95,35,45,65,15,12,37,88,92);
		
		Integer ln =
				num.stream()
				.distinct()
				.sorted()
				.skip(2)
				.findFirst()
				.get();
				
		System.out.println(ln);
	}
}

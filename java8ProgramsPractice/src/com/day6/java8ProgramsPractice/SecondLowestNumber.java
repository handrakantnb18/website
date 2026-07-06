package com.day6.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SecondLowestNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(100,555,23,789,
				78,98,52,35,45,12,13,16,14,38);
		
		Integer lowestnum =
				list.stream()
				.distinct()
				.sorted()
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(lowestnum);

		
	}
}

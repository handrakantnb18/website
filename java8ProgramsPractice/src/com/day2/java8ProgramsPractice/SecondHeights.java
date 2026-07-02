package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHeights {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,52,35,45,12,13,16,14,38);
		
		Integer sh =
				list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(sh);
	}
}

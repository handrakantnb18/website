package com.day4.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHeights {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(110,255,235,789,56,
				78,95,62,14,25,72,92,33,55,64,19);
		
		
		Integer second =
				list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(second);
	}
}

package com.day9.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondSmallest {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				55,73,15,25,45,85,88,35,66,12,92);
		
		Integer sec =
				num.stream()
				.distinct()
				.sorted()
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(sec);
	
	}
}

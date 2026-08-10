package com.day8.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SecondLowest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				12,55,64,82,92,33,18,17,22);
		
		Integer low =
				list.stream()
				.distinct()
				.sorted()
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(low);
	}
}

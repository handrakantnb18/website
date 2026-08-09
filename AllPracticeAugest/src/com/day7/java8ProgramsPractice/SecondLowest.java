package com.day7.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SecondLowest {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				19,79,88,35,46,28,77,39);
		Integer low = 
				num.stream()
				.distinct()
				.sorted()
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(low);
		
	}
}

package com.day7.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MinimumNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				45,65,33,28,92,77,65,66,37,82);
		
		Integer minimum =
				list.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(minimum);
	}
}

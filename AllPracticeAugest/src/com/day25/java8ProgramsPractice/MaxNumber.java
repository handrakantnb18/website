package com.day25.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

	// find max number in the list
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				78,99,15,25,45,85,88,35,66,12,92);
		
		Integer max =
				num.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println(max);
	}
}

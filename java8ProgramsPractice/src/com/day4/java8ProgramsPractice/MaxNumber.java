package com.day4.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,95,62,14,25,72,92,33,55,64,19);
		
		Integer max =
				list.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println(max);
	}
}

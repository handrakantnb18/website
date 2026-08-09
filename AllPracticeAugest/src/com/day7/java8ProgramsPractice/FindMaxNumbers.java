package com.day7.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,65,32,18,19,34,55,92,46,37);
		
		Integer maximum =
				list.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println(maximum);
	}
}

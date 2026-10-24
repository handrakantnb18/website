package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// 7. Find the maximum and minimum values in a list

public class MaxMinListSeven {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 45, 2, 99, 23);
		
		int max = 
				numbers.stream()
				.max(Integer::compare)
				.orElseThrow();
		
		int min = 
				numbers.stream()
				.min(Integer::compare)
				.orElseThrow();

		System.out.println("Max: " + max + 
				", Min: " + min);

	}
}

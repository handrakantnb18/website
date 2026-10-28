package com.day27.javaProgramsPractice;

import java.util.*;

// How to find the maximum value in a list of integers using Stream & Method Refrerence

public class StreamMaxTestTherteen {

	public static Optional<Integer> findMax(List<Integer> numbers) {
		
		return numbers.stream().max(Integer::compare);
	}

	public static void main(String[] args) {

		List<Integer> numbers = 
				Arrays.asList(12, 42, 36, 54, 35);
		
		System.out.println(findMax(numbers).orElse(-1));

	}
}

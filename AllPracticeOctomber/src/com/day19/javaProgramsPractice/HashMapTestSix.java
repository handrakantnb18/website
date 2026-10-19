package com.day19.javaProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// The methos is used to sort the given elements

public class HashMapTestSix {

	public static void main(String[] args) {

		List<Integer> numbers = 
				Arrays.asList(14, 5, 11, 7);
		
		Collections.sort(numbers);
		System.out.println(numbers);

	}
}

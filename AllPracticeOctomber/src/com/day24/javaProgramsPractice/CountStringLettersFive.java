package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// 5. Count the number of strings that start with a specific letter

public class CountStringLettersFive {

	public static void main(String[] args) {

		List<String> names = 
				Arrays.asList("Apple", "Banana", "Avocado", "Cherry");

		long count = names.stream()
				.filter(name -> name.startsWith("A"))
				.count();
		
		System.out.println(count);

	}
}

package com.day31.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HieghestNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				12,35,66,48,92,78,97,66,548,82,86,71);
		
		Integer high =
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(high);
	}
}

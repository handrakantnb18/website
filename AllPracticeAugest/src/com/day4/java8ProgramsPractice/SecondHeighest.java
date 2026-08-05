package com.day4.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHeighest {

	// find second Highest in the list

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(78,98,65,45,28,
				73,29,18,55,46);
		
		Integer second =
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(second);
		
	}
}

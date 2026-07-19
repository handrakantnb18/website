package com.day14.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondHeigest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,95,65,22,45,63,18,22,98,75,12,16,18);
		Integer hs =
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(hs);
	}
}

package com.day7.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHeighest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				45,65,88,28,29,79,12,16,99);
		
		Integer heigh =
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(heigh);
		
	}
}

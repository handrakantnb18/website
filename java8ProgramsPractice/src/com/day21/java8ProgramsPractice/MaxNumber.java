package com.day21.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList
				(78,98,65,25,33,2,12,33,58);
		
		Integer max =
				list.stream()
				.max(Integer::compareTo)
				.get();
		
		System.out.println(max);
	}
}

package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				1,25,34,78,95,85,65,99,255,35);
		
		Integer maxno =
					list.stream()
					.max(Integer::compareTo)
					.get();
		
		System.out.println(maxno);
	}
}

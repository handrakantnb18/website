package com.day9.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FindMinimumNumber {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				15,25,45,85,88,35,66,12,92);
		
		Integer min =
				num.stream()
				.min(Integer::compareTo)
				.get();
		
		System.out.println(min);
	}
}

package com.day1.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				10,15,65,4,8,65,32,45,88,22);
		
		Integer sh =
				list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(sh);
	}
}

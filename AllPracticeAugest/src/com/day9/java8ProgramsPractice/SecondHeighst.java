package com.day9.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHeighst {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				15,25,45,85,88,35,66,12,92);
		
		Integer sec =
				num.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(sec);
	}
}

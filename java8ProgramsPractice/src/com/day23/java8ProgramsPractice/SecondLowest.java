package com.day23.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLowest {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(
				10,15,65,4,8,65,32,45,88,22);
		
		Integer slso =
				list.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.get();
		
		
		System.out.println(slso);
	}
}

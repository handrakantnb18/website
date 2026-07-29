package com.day22.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHeighest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList
				(88,5,78,98,65,25,33,2,12,33,58);
		
		Integer second =
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(3)
				.findFirst()
				.get();
		
		System.out.println(second);
	}
}

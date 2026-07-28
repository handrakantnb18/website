package com.day21.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHeighest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList
				(78,98,65,25,33,2,12,33,58);
		
		Integer max =
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(2)
				.findFirst()
				.get();
				
		System.out.println(max);
	}
	}


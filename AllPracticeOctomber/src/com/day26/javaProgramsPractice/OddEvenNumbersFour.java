package com.day26.javaProgramsPractice;

import java.util.*;
import java.util.stream.Collectors;

// Q4: Partition a list of numbers into two separate lists: Odd and Even.

public class OddEvenNumbersFour {

	public static void main(String[] args) {

		List<Integer> list = 
				Arrays.asList(1, 2, 3, 4, 5, 6);
		
		Map<Boolean, List<Integer>> partitioned = 
				list.stream()
				.collect(Collectors.partitioningBy
						(n -> n % 2 == 0));

		System.out.println(partitioned);

	}
}

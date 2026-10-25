package com.day24.javaProgramsPractice;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 18. Merge two maps merging common keys

public class MergeTwoEighteen {

	public static void main(String[] args) {

		Map<String, Integer> map1 = 
				Map.of("A", 1, "B", 2);

		Map<String, Integer> map2 = 
				Map.of("B", 3, "C", 4);

		Map<String, Integer> mergedMap = 
				Stream.concat(map1.entrySet()
						.stream(), 
						map2.entrySet()
						.stream())
				
				.collect(Collectors.toMap
						(Map.Entry::getKey, 
								Map.Entry::getValue, 
								Integer::sum));

		System.out.println(mergedMap);

	}
}

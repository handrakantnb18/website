package com.day22.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// flatmap() operation returns an arbitrary number of values as the output
// one-to-many mapping occurs in flatMap()
// Product stream of stream value
// flatmap() is used both for transformation and mapping

public class FlatMapStreamTestTwo {

	public static void main(String[] args) {
		
		List<List<Integer>> num = new ArrayList<List<Integer>>();
		num.add(Arrays.asList(1, 2));
		num.add(Arrays.asList(3, 4));
		num.add(Arrays.asList(5, 6));
		num.add(Arrays.asList(7, 8));
		num.add(Arrays.asList(9, 10));
		num.add(Arrays.asList(11, 12));
		
		System.out.println("List if last : "+num);
		
		List<Integer> fm =
				num.stream()
				.flatMap(list -> list.stream())
				.collect(Collectors.toList());
		
		System.out.println("List generate by flatMap : "+fm);
		
	}
}

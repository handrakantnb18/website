package com.zeroToHero.core;

import java.util.Arrays;
import java.util.List;

public class LatestSecondHeighest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				878,56,352,5,6,8,65,6,34,4);
		
		Integer second =
				list.stream()
				.distinct()
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(second);
	}
}

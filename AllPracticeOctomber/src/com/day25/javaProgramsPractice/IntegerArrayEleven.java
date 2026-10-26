package com.day25.javaProgramsPractice;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

// 11. Given an integer array nums, return true if any 
// value appears at least twice in the array, and return
// false if every element is distinct.

// Check Whether an Integer Array Contains Duplicate Elements.

public class IntegerArrayEleven {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 2 };

		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

		Set<Integer> set = new HashSet<>(list);

		if (set.size() == list.size()) {
			
			System.out.println(false);
		} 
		else {
			System.out.println(true);
		}

	}
}

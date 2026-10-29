package com.day29.javaProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// 5. Find Duplicate Elements in an Array

public class DuplicateElementsFive {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 20, 40, 10, 50 };

		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int num : arr) {
			if (!seen.add(num)) {
				duplicates.add(num);
			}
		}

		System.out.println(duplicates);

	}
}

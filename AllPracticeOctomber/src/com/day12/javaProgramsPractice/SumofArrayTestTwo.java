package com.day12.javaProgramsPractice;

import java.util.Arrays;

// One-Line Solution Using Java Streams

public class SumofArrayTestTwo {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		int sum = Arrays.stream(nums).sum();
		System.out.println(sum);

	}
}

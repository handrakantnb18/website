package com.day2.java;

import java.util.stream.IntStream;

// How do you find sum of first 10 natural numbers

public class SumOfDigit {

	public static void main(String[] args) {

		int sum = IntStream.range(1, 15)
				.sum();

		System.out.println(sum);

	}
}

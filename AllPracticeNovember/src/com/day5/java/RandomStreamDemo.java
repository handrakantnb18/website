package com.day5.java;

// Using java.util.random for Stream Operations

import java.util.random.RandomGenerator;

public class RandomStreamDemo {

	public static void main(String[] args) {

		RandomGenerator generator = RandomGenerator.of("Xoshiro256PlusPlus");

		generator.doubles(5, 0.0, 1.0)
		.forEach(System.out::println);

	}
}

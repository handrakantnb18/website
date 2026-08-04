package com.day3.java8ProgramsPractice;

import java.util.function.Function;

public class FunctionFunctionalInterface {

	// Takes one input and returns a transformed result.
	public static void main(String[] args) {
		
		Function<Integer, Integer> s = n -> n * n;
		
		System.out.println(s.apply(5));
		System.out.println(s.apply(10));
	}
}

package com.day6.javaProgramsPractice;

import java.util.stream.IntStream;

// IntStream, LongStream, DoubleStream 

public class Stream8TestSix {

	public static void main(String[] args) {
		
		IntStream.range(1, 5)
		 .forEach(System.out::println);
		
	}
}

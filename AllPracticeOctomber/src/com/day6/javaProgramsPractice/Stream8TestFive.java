package com.day6.javaProgramsPractice;

import java.util.stream.Stream;

// Streams can also generate unbounded sequences. Use limit() to avoid infinite execution

public class Stream8TestFive {

	public static void main(String[] args) {
		
		Stream.iterate(1, n -> n + 1)
        .limit(5)
        .forEach(System.out::println);
		
	}
}

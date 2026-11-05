package com.day4.java;

import java.util.stream.IntStream;

// Write a Program to Iterate over a Stream with Indices

public class IterateOver {

	public static void main(String[] args) {
		
		String[] array = { "G", "E", "E", "k" };

        IntStream
                .range(0, array.length)
                .mapToObj(index -> String.format
                		("%d -> %s", index, array[index]))
                .forEach(System.out::println);
        
	}
}

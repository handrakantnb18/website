package com.day7.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// It supports operations like filtering, mapping, sorting, reducing, and collecting elements

public class Stream8TestOne {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java", "Python", "C++");
        Stream<String> stream1 = list.stream();
        
        String[] arr = {"A", "B", "C"};
        Stream<String> stream2 = Arrays.stream(arr);
        
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
        
        Stream<Integer> stream4 = Stream.iterate(1, n -> n + 1).limit(5);
        stream4.forEach(System.out::println);
        
	}
}

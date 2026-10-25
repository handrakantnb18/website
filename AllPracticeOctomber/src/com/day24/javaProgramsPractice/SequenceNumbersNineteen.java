package com.day24.javaProgramsPractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 19. Generate a sequence of numbers up to N using Stream iterate

public class SequenceNumbersNineteen {

	public static void main(String[] args) {

		List<Integer> sequence = 
				Stream.iterate(1, n -> n + 2)
				.limit(5).collect(Collectors.toList());

		System.out.println(sequence);

	}
}

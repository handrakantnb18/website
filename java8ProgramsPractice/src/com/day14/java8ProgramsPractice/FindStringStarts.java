package com.day14.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FindStringStarts {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList(
				"Amit", "Anil", "Pravin", "Ram", "Ankush","Pramod","Prakash");

		names.stream()
		.filter(s -> s.startsWith("P"))
		.forEach(System.out::println);

	}
}

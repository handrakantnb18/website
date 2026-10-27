package com.day27.javaProgramsPractice;

import java.util.Set;

// if you are using JDK 9 and above version, you can even minimize the lines of code

public class SetValuesRetrievalTestFour {

	public static void main(String[] args) {

		Set<String> set = Set.of("Banglore", "California", 
				"Chicago", "New York", "Mumbai", "Pune");

		set.stream()
		.forEach(System.out::println);

	}
}

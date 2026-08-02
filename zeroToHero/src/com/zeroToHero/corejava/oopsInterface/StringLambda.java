package com.zeroToHero.corejava.oopsInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLambda {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"Ram", "Rahul", "Pooja", "Mary", 
				"John", "Amit", "Anil", "Priyanka");
		
		List<String> names =
				str.stream()
				.filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());
		
		names.forEach(name -> System.out.println(name));
		
	}
}

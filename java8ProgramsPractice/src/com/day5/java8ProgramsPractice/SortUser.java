package com.day5.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortUser {

	public static void main(String[] args) {
		
		List<User> list = Arrays.asList(
				new User(1, "Rahul", "Pune" ,"IT"),
				new User(2, "OM", "Pune" ,"Sales"),
				new User(3, "Omkar", "Pune", "Trans")
				);
		
		list.stream()
		.sorted(Comparator.comparing(e -> e.getName()))
		.forEach(System.out::println);
		
	
	}
}

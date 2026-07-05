package com.day5.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortBooks {

	public static void main(String[] args) {
		
		List<Book> list = Arrays.asList(
				new Book(1, "Rahul", "Pune" ,"IT"),
				new Book(2, "OM", "Pune" ,"Sales"),
				new Book(3, "Omkar", "Pune", "Trans")
				);
		
		
		list.stream()
		.sorted(Comparator.comparing(e -> e.getName()))
		.forEach(System.out::println);
		
	}
}

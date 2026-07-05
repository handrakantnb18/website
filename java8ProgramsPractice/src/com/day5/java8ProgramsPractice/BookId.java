package com.day5.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.day1.java8ProgramsPractice.Student;

public class BookId {

	public static void main(String[] args) {
		
		List<Book> list = Arrays.asList(
				new Book(1, "Rahul", "Pune" ,"IT"),
				new Book(2, "OM", "Pune" ,"Sales"),
				new Book(3, "Omkar", "Pune", "Trans")
				);
		
		Map<Integer, Book> map =
		list.stream()
		.collect(Collectors.toMap(Book::getId, s->s));
		
		System.out.println(map);
	
	}
}

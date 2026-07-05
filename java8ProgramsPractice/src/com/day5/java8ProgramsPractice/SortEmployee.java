package com.day5.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.day1.java8ProgramsPractice.Student;

public class SortEmployee {

	public static void main(String[] args) {
		
		
		List<Student> list = Arrays.asList(
				new Student(101, "Chandrakant", 5500.00),
				new Student(102, "Priyanka", 44000.00),
				new Student(103, "Shivraj", 33000.00));
		
		list.stream()
		.sorted(Comparator.comparingDouble(e -> e.getSalary()))
		.forEach(System.out::println);
		
	}
}

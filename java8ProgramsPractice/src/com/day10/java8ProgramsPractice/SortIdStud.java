package com.day10.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.day1.java8ProgramsPractice.Student;

public class SortIdStud {

	public static void main(String[] args) {
		
		// Convert List into Map
				List<Student> list = Arrays.asList(
						new Student(1, "Rahul", 7898788.00),
						new Student(2, "OM", 456325.00),
						new Student(3, "Omkar", 258789.00)
						);
				
				Map<Integer, Student> map =
				list.stream()
				.collect(Collectors.toMap(Student::getId, s->s));
				
				System.out.println(map);
			
	}
}

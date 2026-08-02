package com.zeroToHero.corejava.oopsInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentEmployee {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				
				new Student(101, "Amit", 55000.0, 3, "IT"),
			    new Student(102, "Rahul", 85000.0, 7, "Computer"),
			    new Student(103, "Priya", 95000.0, 8, "Electronics"),
			    new Student(104, "Sneha", 45000.0, 2, "Mechanical"),
			    new Student(105, "Vikas", 70000.0, 5, "Civil"),
			    new Student(106, "Pooja", 65000.0, 4, "IT"),
			    new Student(107, "Rohit", 120000.0, 10, "Computer"),
			    new Student(108, "Neha", 50000.0, 2, "Electrical"),
			    new Student(109, "Kiran", 98000.0, 9, "Electronics"),
			    new Student(110, "Anjali", 60000.0, 5, "Civil")
			    
				);
		
		List<Student> result =
				list.stream()
				.filter(e -> e.getExperience() >= 5)
				.filter(e -> e.getSalary() >= 70000.0)
				.sorted(Comparator.comparing(Student::getSalary))
				.toList();
		
		result.forEach(System.out::println);
		
	}
}

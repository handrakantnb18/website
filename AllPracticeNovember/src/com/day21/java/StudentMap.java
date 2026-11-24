package com.day21.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentMap {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(

				new Student(101, "Rahul", "rahul@gmail.com", 22, "Male", 85.5, "Pune", "Java"),

				new Student(102, "Amit", "amit@gmail.com", 23, "Male", 90.0, "Mumbai", "Python"),

				new Student(103, "Priya", "priya@gmail.com", 21, "Female", 78.5, "Pune", "Java"),

				new Student(104, "Sneha", "sneha@gmail.com", 22, "Female", 92.0, "Sangli", "Angular"),

				new Student(105, "Vikas", "vikas@gmail.com", 24, "Male", 65.5, "Kolhapur", "Java"),

				new Student(106, "Pooja", "pooja@gmail.com", 20, "Female", 88.0, "Mumbai", "Python"),

				new Student(107, "Rohit", "rohit@gmail.com", 23, "Male", 72.5, "Pune", "Spring Boot"),

				new Student(108, "Neha", "neha@gmail.com", 21, "Female", 95.0, "Sangli", "Java"),

				new Student(109, "Kiran", "kiran@gmail.com", 22, "Male", 81.5, "Nashik", "Angular"),

				new Student(110, "Anjali", "anjali@gmail.com", 20, "Female", 89.5, "Pune", "Spring Boot"));

		Student highestMarksStudent = 
				students.stream()
				.max(Comparator.comparing
						(Student::getMarks))
				.orElse(null);

		if (highestMarksStudent != null) {

			System.out.println("Highest Marks Student Details:");

			System.out.println("ID     : " + highestMarksStudent.getSid());
			System.out.println("Name   : " + highestMarksStudent.getName());
			
			System.out.println("Marks  : " + highestMarksStudent.getMarks());
			System.out.println("City   : " + highestMarksStudent.getCity());
			System.out.println("Course : " + highestMarksStudent.getCourse());
		
		}

	}
}

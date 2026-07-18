package com.day13.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class StudentName {

	public static void main(String[] args) {
		
		 List<Student> list = Arrays.asList(
				    new Student(101, "Rahul", "Pune", "Pune University"),
				    new Student(101, "Rahul", "Pune", "Pune University"),
				    new Student(102, "Amit", "Mumbai", "Mumbai University"),
				    new Student(103, "Sachin", "Nagpur", "RTM Nagpur University"),
				    new Student(104, "Priya", "Nashik", "Savitribai Phule Pune University"),
				    new Student(105, "Sneha", "Kolhapur", "Shivaji University"),
				    new Student(106, "Rohit", "Satara", "Shivaji University"),
				    new Student(107, "Neha", "Solapur", "Solapur University"),
				    new Student(108, "Amit", "Sangli", "Dr. Babasaheb Ambedkar Marathwada University"),
				    new Student(109, "Vikas", "Sangli", "Shivaji University"),
				    new Student(110, "Anjali", "Sangli", "Savitribai Phule Pune University")

				 );

		 list.stream()
		 .filter(s -> s.getSname().equals("Amit") && s.getCity().equals("Sangli"))
		 .forEach(System.out::println);
	}
}

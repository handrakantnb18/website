package com.day19.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentIdName {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
			    new Student(1001, "Ram", "ram@gmail.com", "Pune", 25, "MCA", 62.46),
			    new Student(1002, "Shyam", "shyam@gmail.com", "Mumbai", 24, "BCA", 74.85),
			    new Student(1003, "Rahul", "rahul@gmail.com", "Nagpur", 23, "B.Tech", 81.20),
			    new Student(1004, "Amit", "amit@gmail.com", "Nashik", 22, "M.Sc", 69.75),
			    new Student(1005, "Priya", "priya@gmail.com", "Pune", 24, "MBA", 88.40),
			    new Student(1006, "Sneha", "sneha@gmail.com", "Aurangabad", 23, "MCA", 79.60),
			    new Student(1007, "Pooja", "pooja@gmail.com", "Kolhapur", 22, "B.Sc", 72.15),
			    new Student(1008, "Rohit", "rohit@gmail.com", "Solapur", 25, "BCA", 65.30),
			    new Student(1009, "Sachin", "sachin@gmail.com", "Satara", 24, "B.Tech", 91.50),
			    new Student(1010, "Neha", "neha@gmail.com", "Thane", 23, "MBA", 85.95)
			);
		
//		list.stream()
//				.forEach(System.out::println);
		
//		list.stream()
//	    .map(Student::getName)
//	    .forEach(System.out::println);
		
		Map<Integer, Student> studentMap = list.stream()
		        .collect(Collectors.toMap(
		                Student::getId,
		                student -> student
		        ));

		studentMap.forEach((id, student) ->
		        System.out.println(id + " -> " + student));
		
		
		
	}
}

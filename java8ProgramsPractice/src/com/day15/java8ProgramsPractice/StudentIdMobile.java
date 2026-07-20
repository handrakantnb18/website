package com.day15.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentIdMobile {

	public static void main(String[] args) {
		
		List<Student> stud = Arrays.asList(
				 new Student(101, "Ram", "Pune", "ram@gmail.com", 9876543210L),
				    new Student(102, "Shyam", "Mumbai", "shyam@gmail.com", 9876543211L),
				    new Student(103, "Rahul", "Nagpur", "rahul@gmail.com", 9876543212L),
				    new Student(104, "Amit", "Nashik", "amit@gmail.com", 9876543213L),
				    new Student(105, "Priya", "Kolhapur", "priya@gmail.com", 9876543214L),
				    new Student(106, "Neha", "Pune", "neha@gmail.com", 9876543215L),
				    new Student(107, "Kiran", "Satara", "kiran@gmail.com", 9876543216L),
				    new Student(108, "Rohit", "Sangli", "rohit@gmail.com", 9876543217L),
				    new Student(109, "Pooja", "Solapur", "pooja@gmail.com", 9876543218L),
				    new Student(110, "Vikas", "Aurangabad", "vikas@gmail.com", 9876543219L)
				); 
		
		Map<Integer, String> map = 
				stud.stream()
		        .collect(Collectors.toMap(
		                Student::getId,
		                Student::getName
		        ));
		
		map.forEach((id, name) -> System.out.println(id+ " : "+name));

	}
}

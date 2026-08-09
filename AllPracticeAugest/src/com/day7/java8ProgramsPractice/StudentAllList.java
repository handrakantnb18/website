package com.day7.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class StudentAllList {

	public static void main(String[] args) {
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(101, new Student(101, "Amit", "amit@gmail.com", "Java", "Pune", 45000.0, "IT"));

		map.put(102, new Student(102, "Rahul", "rahul@gmail.com", "Python", "Mumbai", 40000.0, "CS"));

		map.put(103, new Student(103, "Priya", "priya@gmail.com", "Java", "Pune", 50000.0, "IT"));

		map.put(104, new Student(104, "Sneha", "sneha@gmail.com", "React", "Nashik", 35000.0, "CS"));

		map.put(105, new Student(105, "Akash", "akash@gmail.com", "Spring Boot", "Pune", 55000.0, "IT"));

		map.put(106, new Student(106, "Neha", "neha@gmail.com", "Angular", "Mumbai", 42000.0, "CS"));

		map.put(107, new Student(107, "Rohit", "rohit@gmail.com", "Java", "Nagpur", 48000.0, "IT"));
		
		map.forEach((id, name) -> System.out.println(id+" "+name));
		
		
		
	}
}

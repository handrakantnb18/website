package com.day4.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class StudentCity {

	public static void main(String[] args) {
		
Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(101, new Student(101, "Amit", "COEP Pune", "Pune", "9876543210", "amit@gmail.com", "Computer Engineering"));

		map.put(102, new Student(102, "Rahul", "VIT Pune", "Mumbai", "9876543211", "rahul@gmail.com", "Information Technology"));

		map.put(103, new Student(103, "Sneha", "MIT Pune", "Nashik", "9876543212", "sneha@gmail.com", "Electronics"));

		map.put(104, new Student(104, "Priya", "PCCOE", "Pimpri", "9876543213", "priya@gmail.com", "Mechanical"));

		map.put(105, new Student(105, "Rohit", "DY Patil", "Kolhapur", "9876543214", "rohit@gmail.com", "Civil"));

		map.put(106, new Student(106, "Neha", "Modern College", "Satara", "9876543215", "neha@gmail.com", "BCA"));

		map.put(107, new Student(107, "Kiran", "Fergusson College", "Sangli", "9876543216", "kiran@gmail.com", "BSc Computer Science"));

		map.put(108, new Student(108, "Pooja", "Sinhgad College", "Solapur", "9876543217", "pooja@gmail.com", "MBA"));

		map.put(109, new Student(109, "Akash", "JSPM", "Ahmednagar", "9876543218", "akash@gmail.com", "Electrical"));

		map.put(110, new Student(110, "Anjali", "SPPU", "Aurangabad", "9876543219", "anjali@gmail.com", "MCA"));


		map.entrySet()
		.stream()
		.filter(entry -> entry.getValue().getAddress().equalsIgnoreCase("Pune"))
		.forEach(System.out::println);
		
	}
}

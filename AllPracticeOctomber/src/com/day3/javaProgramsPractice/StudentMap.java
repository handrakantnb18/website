package com.day3.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {

		Map<Integer, Student> map = new HashMap<Integer, Student>();

		map.put(1, new Student(1, "Rahul", "rahul@gmail.com", 45000.0, "Fergusson College", "Pune", "Computer Science"));

		map.put(2, new Student(2, "Priya", "priya@gmail.com", 50000.0, "Modern College", "Pune", "Information Technology"));

		map.put(3, new Student(3, "Amit", "amit@gmail.com", 35000.0, "Shivaji College", "Sangli", "Commerce"));

		map.put(4, new Student(4, "Sneha", "sneha@gmail.com", 60000.0, "COEP", "Pune", "Mechanical"));

		map.put(5, new Student(5, "Rohit", "rohit@gmail.com", 40000.0, "RTM Nagpur University", "Nagpur", "Computer Science"));

		map.put(6, new Student(6, "Pooja", "pooja@gmail.com", 55000.0, "SP College", "Pune", "Electronics"));

		map.put(7, new Student(7, "Akash", "akash@gmail.com", 30000.0, "Willigdon College", "Sangli", "Commerce"));

		map.put(8, new Student(8, "Neha", "neha@gmail.com", 65000.0, "VNIT", "Nagpur", "Civil"));

		map.put(9, new Student(9, "Sagar", "sagar@gmail.com", 48000.0, "Modern College", "Pune", "Information Technology"));

		map.put(10, new Student(10, "Kiran", "kiran@gmail.com", 38000.0, "Shivaji College", "Kolhapur", "Science"));
		
		
//		map.forEach((id, name) -> {
//			System.out.println(id+" "+name);
//		});

		map.entrySet()
		   .stream()
		   .filter(entry -> entry.getValue()
				   .getFees() < 46000)
		   .forEach(entry -> System.out.println(
				   entry.getValue()));
		
		
	}

}

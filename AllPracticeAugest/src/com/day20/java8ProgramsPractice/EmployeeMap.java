package com.day20.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> list = new HashMap<Integer, Employee>();
		
		list.put(101, new Employee(101, "Rahul", "IT", "9876543210", 55000.0, "Pune", "rahul@gmail.com", "Java"));

		list.put(102, new Employee(102, "Amit", "HR", "9876543211", 48000.0, "Mumbai", "amit@gmail.com", "Spring"));

		list.put(103, new Employee(103, "Priya", "Finance", "9876543212", 62000.0, "Nashik", "priya@gmail.com", "Java"));

		list.put(104, new Employee(104, "Sneha", "IT", "9876543213", 70000.0, "Pune", "sneha@gmail.com", "React"));

		list.put(105, new Employee(105, "Vijay", "Sales", "9876543214", 45000.0, "Sangli", "vijay@gmail.com", "Java"));

		list.put(106, new Employee(106, "Neha", "HR", "9876543215", 52000.0, "Kolhapur", "neha@gmail.com", "Spring Boot"));

		list.put(107, new Employee(107, "Rohit", "IT", "9876543216", 68000.0, "Satara", "rohit@gmail.com", "Java"));

		list.put(108, new Employee(108, "Pooja", "Finance", "9876543217", 59000.0, "Pune", "pooja@gmail.com", "SQL"));

		list.put(109, new Employee(109, "Suresh", "Sales", "9876543218", 47000.0, "Mumbai", "suresh@gmail.com", "Java"));

		list.put(110, new Employee(110, "Kiran", "IT", "9876543219", 75000.0, "Nashik", "kiran@gmail.com", "Spring Boot"));
		
		
//		list.forEach((e1, e2) -> {
//			System.out.println(e1+ " : "+e2);
//		});
		
//		list.forEach((id, emp) -> {
//			System.out.println(id+ " : "+emp.getSalary());
//		});
		
		
		list.values()
		   .stream()
		   .map(Employee::getSalary)
		   .forEach(System.out::println);
		
	}
}

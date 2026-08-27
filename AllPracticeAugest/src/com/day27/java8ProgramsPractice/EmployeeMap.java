package com.day27.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(101, new Employee(101, "Rahul", "IT", "9876543210", 60000.0, "Pune", "rahul@gmail.com", "Developer"));

		map.put(102, new Employee(102, "Amit", "HR", "9876543211", 55000.0, "Mumbai", "amit@gmail.com", "HR Manager"));

		map.put(103, new Employee(103, "Priya", "Finance", "9876543212", 65000.0, "Pune", "priya@gmail.com", "Accountant"));

		map.put(104, new Employee(104, "Sneha", "IT", "9876543213", 70000.0, "Nashik", "sneha@gmail.com", "Senior Developer"));

		map.put(105, new Employee(105, "Vijay", "Sales", "9876543214", 50000.0, "Sangli", "vijay@gmail.com", "Sales Executive"));

		map.put(106, new Employee(106, "Neha", "IT", "9876543215", 75000.0, "Pune", "neha@gmail.com", "Team Lead"));

		map.put(107, new Employee(107, "Rohit", "Marketing", "9876543216", 58000.0, "Kolhapur", "rohit@gmail.com", "Marketing Executive"));

		map.put(108, new Employee(108, "Pooja", "HR", "9876543217", 52000.0, "Pune", "pooja@gmail.com", "HR Executive"));

		map.put(109, new Employee(109, "Suresh", "Finance", "9876543218", 68000.0, "Mumbai", "suresh@gmail.com", "Finance Manager"));

		map.put(110, new Employee(110, "Kiran", "IT", "9876543219", 80000.0, "Pune", "kiran@gmail.com", "Architect"));
		
		System.out.println("----------------------");
//		map.forEach((id, emp) -> {
//			System.out.println(id+ " : "+emp);
//		});
//		System.out.println("--------------------");
		
		map.values()
		.stream()
		.filter(emp -> emp.getSalary() > 70000)
		.forEach(System.out::println);
		
		
	}
}

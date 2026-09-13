package com.day13.java8ProgramsPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(101, new Employee(101, "Rahul", "rahul@gmail.com", 55000.0, "IT", "Pune", "Java Developer"));

		map.put(102, new Employee(102, "Amit", "amit@gmail.com", 65000.0, "HR", "Mumbai", "HR Executive"));

		map.put(103, new Employee(103, "Sneha", "sneha@gmail.com", 75000.0, "IT", "Pune", "Senior Java Developer"));

		map.put(104, new Employee(104, "Priya", "priya@gmail.com", 48000.0, "Finance", "Nashik", "Accountant"));

		map.put(105, new Employee(105, "Vikas", "vikas@gmail.com", 82000.0, "IT", "Bangalore", "Backend Developer"));

		map.put(106, new Employee(106, "Neha", "neha@gmail.com", 58000.0, "Testing", "Pune", "QA Engineer"));

		map.put(107, new Employee(107, "Rohit", "rohit@gmail.com", 70000.0, "IT", "Mumbai", "Full Stack Developer"));

		map.put(108, new Employee(108, "Pooja", "pooja@gmail.com", 45000.0, "HR", "Pune", "HR Executive"));

		map.put(109, new Employee(109, "Suresh", "suresh@gmail.com", 90000.0, "IT", "Hyderabad", "Tech Lead"));

		map.put(110, new Employee(110, "Kiran", "kiran@gmail.com", 62000.0, "Finance", "Pune", "Financial Analyst"));
		
//		map.forEach((id, name) -> {
//			System.out.println(id+" "+name);
//		});
		
		
		List<Employee> list = map.values()
		        .stream()
		        .filter(e -> e.getSalary() > 60000)
		        .toList();

		System.out.println(list);
		
		
	}
	
}

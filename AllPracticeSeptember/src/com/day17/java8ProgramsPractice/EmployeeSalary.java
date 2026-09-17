package com.day17.java8ProgramsPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.day16.java8ProgramsPractice.Employee;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Map<Integer, Emplouyee> map = new HashMap<Integer, Emplouyee>();
		
		map.put(101, new Emplouyee(101, "Rahul", "rahul@gmail.com", 55000.0, "IT", "Pune", "Java Developer"));

		map.put(102, new Emplouyee(102, "Amit", "amit@gmail.com", 65000.0, "HR", "Mumbai", "HR Executive"));

		map.put(103, new Emplouyee(103, "Sneha", "sneha@gmail.com", 75000.0, "IT", "Pune", "Senior Java Developer"));

		map.put(104, new Emplouyee(104, "Priya", "priya@gmail.com", 48000.0, "Finance", "Nashik", "Account Executive"));

		map.put(105, new Emplouyee(105, "Vijay", "vijay@gmail.com", 85000.0, "IT", "Bangalore", "Spring Boot Developer"));

		map.put(106, new Emplouyee(106, "Neha", "neha@gmail.com", 62000.0, "Admin", "Pune", "Admin Manager"));

		map.put(107, new Emplouyee(107, "Suresh", "suresh@gmail.com", 72000.0, "Finance", "Mumbai", "Financial Analyst"));

		map.put(108, new Emplouyee(108, "Pooja", "pooja@gmail.com", 58000.0, "IT", "Hyderabad", "Backend Developer"));

		map.put(109, new Emplouyee(109, "Rohit", "rohit@gmail.com", 95000.0, "IT", "Pune", "Tech Lead"));

		map.put(110, new Emplouyee(110, "Kiran", "kiran@gmail.com", 52000.0, "HR", "Nagpur", "HR Executive"));

//		map.forEach((id, name) -> {
//			System.out.println(id+" "+name);
//		});
		
		Emplouyee emp = map.values()
		        .stream()
		        .max(Comparator.comparing(Emplouyee::getSalary))
		        .orElse(null);

		System.out.println(emp);
		
		
	}
}

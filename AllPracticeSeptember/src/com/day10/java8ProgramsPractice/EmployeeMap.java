package com.day10.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

import com.day9.java8ProgramsPractice.Employee;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		emp.put(101, new Employee(101, "Rahul", "rahul@gmail.com", 55000.0, "IT", "Pune"));

		emp.put(102, new Employee(102, "Amit", "amit@gmail.com", 65000.0, "HR", "Mumbai"));

		emp.put(103, new Employee(103, "Sneha", "sneha@gmail.com", 72000.0, "IT", "Pune"));

		emp.put(104, new Employee(104, "Priya", "priya@gmail.com", 48000.0, "Finance", "Nashik"));

		emp.put(105, new Employee(105, "Vijay", "vijay@gmail.com", 85000.0, "IT", "Bangalore"));

		emp.put(106, new Employee(106, "Neha", "neha@gmail.com", 60000.0, "HR", "Pune"));

		emp.put(107, new Employee(107, "Suresh", "suresh@gmail.com", 92000.0, "Finance", "Mumbai"));

		emp.put(108, new Employee(108, "Pooja", "pooja@gmail.com", 75000.0, "IT", "Hyderabad"));

		emp.put(109, new Employee(109, "Rohit", "rohit@gmail.com", 58000.0, "Sales", "Pune"));

		emp.put(110, new Employee(110, "Kiran", "kiran@gmail.com",  68000.0, "Sales", "Mumbai"));
		
		emp.forEach((id, name) -> {
			System.out.println(id+ " = "+name);
		});

	}
}

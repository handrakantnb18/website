package com.day12.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {

	public static void main(String[] args) {

		Map<Integer, Employee> emp = new HashMap<Integer, Employee>();

		emp.put(101, new Employee(101, "Rahul", "rahul@gmail.com", 55000.0, "IT", "Pune"));

		emp.put(102, new Employee(102, "Priya", "priya@gmail.com", 65000.0, "HR", "Mumbai"));

		emp.put(103, new Employee(103, "Amit", "amit@gmail.com", 75000.0, "IT", "Pune"));

		emp.put(104, new Employee(104, "Sneha", "sneha@gmail.com", 48000.0, "Finance", "Nagpur"));

		emp.put(105, new Employee(105, "Vikas", "vikas@gmail.com", 85000.0, "IT", "Mumbai"));

		emp.put(106, new Employee(106, "Neha", "neha@gmail.com", 60000.0, "HR", "Pune"));

		emp.put(107, new Employee(107, "Sagar", "sagar@gmail.com", 45000.0, "Finance", "Nashik"));

		emp.put(108, new Employee(108, "Pooja", "pooja@gmail.com", 90000.0, "IT", "Bangalore"));

		emp.put(109, new Employee(109, "Akash", "akash@gmail.com", 70000.0, "Sales", "Pune"));

		emp.put(110, new Employee(110, "Kiran", "kiran@gmail.com", 52000.0, "Sales", "Mumbai"));

		emp.forEach((id, name) -> {
			System.out.println(id + " : " + name);
		});

		
		
	}
}

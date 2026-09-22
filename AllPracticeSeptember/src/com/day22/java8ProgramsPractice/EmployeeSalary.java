package com.day22.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;


public class EmployeeSalary {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();

		map.put(101, new Employee(101, "Rahul Sharma", "rahul@gmail.com", 55000.0, "IT", "Pune"));

		map.put(102, new Employee(102, "Amit Patil", "amit@gmail.com", 65000.0, "HR", "Mumbai"));

		map.put(103, new Employee(103, "Sneha Deshmukh", "sneha@gmail.com", 72000.0, "Finance", "Pune"));

		map.put(104, new Employee(104, "Priya Kulkarni", "priya@gmail.com", 48000.0, "IT", "Nashik"));

		map.put(105, new Employee(105, "Rohit Jadhav", "rohit@gmail.com", 85000.0, "Development", "Bangalore"));

		map.put(106, new Employee(106, "Neha Joshi", "neha@gmail.com", 60000.0, "Testing", "Pune"));

		map.put(107, new Employee(107, "Suresh More", "suresh@gmail.com", 75000.0, "Development", "Mumbai"));

		map.put(108, new Employee(108, "Pooja Shinde", "pooja@gmail.com", 52000.0, "HR", "Kolhapur"));

		map.put(109, new Employee(109, "Akash Pawar", "akash@gmail.com", 90000.0, "IT", "Hyderabad"));

		map.put(110, new Employee(110, "Kiran Bhosale", "kiran@gmail.com", 68000.0, "Finance", "Pune"));

		map.forEach((id, name) -> {
			System.out.println(id + " " + name);
		});
		
		

	}
}

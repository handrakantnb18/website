package com.day29.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(101, new Employee(101, "Amit Sharma", "amit@gmail.com", "IT", 75000.0, "Java Developer", "Pune"));

		map.put(102, new Employee(102, "Rahul Patil", "rahul@gmail.com", "HR", 65000.0, "HR Manager", "Mumbai"));

		map.put(103, new Employee(103, "Priya Deshmukh", "priya@gmail.com", "Finance", 80000.0, "Accountant", "Nashik"));

		map.put(104, new Employee(104, "Sneha Joshi", "sneha@gmail.com", "IT", 90000.0, "Senior Developer", "Pune"));

		map.put(105, new Employee(105, "Vijay More", "vijay@gmail.com", "Sales", 55000.0, "Sales Executive", "Kolhapur"));

		map.put(106, new Employee(106, "Neha Kulkarni", "neha@gmail.com", "IT", 85000.0, "Backend Developer", "Pune"));

		map.put(107, new Employee(107, "Suresh Jadhav", "suresh@gmail.com", "Admin", 50000.0, "Admin Executive", "Satara"));

		map.put(108, new Employee(108, "Pooja Pawar", "pooja@gmail.com", "Finance", 70000.0, "Financial Analyst", "Sangli"));

		map.put(109, new Employee(109, "Akash Bhosale", "akash@gmail.com", "IT", 95000.0, "Full Stack Developer", "Pune"));

		map.put(110, new Employee(110, "Kiran Shinde", "kiran@gmail.com", "Marketing", 60000.0, "Marketing Executive", "Aurangabad"));
		
		map.forEach((id, name) -> {
			System.out.println(id+" : "+name);
		});
		
		
	}
}

package com.day26.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(1, new Employee(1, "Rahul", "rahul@gmail.com", "IT", 75000.0, "Pune", "Software Engineer", "9876543210"));

		map.put(2, new Employee(2, "Priya", "priya@gmail.com", "HR", 65000.0, "Mumbai", "HR Manager", "9876543211"));

		map.put(3, new Employee(3, "Amit", "amit@gmail.com", "Finance", 80000.0, "Pune", "Accountant", "9876543212"));

		map.put(4, new Employee(4, "Sneha", "sneha@gmail.com", "IT", 90000.0, "Nashik", "Senior Developer", "9876543213"));

		map.put(5, new Employee(5, "Vijay", "vijay@gmail.com", "Sales", 55000.0, "Nagpur", "Sales Executive", "9876543214"));

		map.put(6, new Employee(6, "Neha", "neha@gmail.com", "IT", 85000.0, "Pune", "Java Developer", "9876543215"));

		map.put(7, new Employee(7, "Raj", "raj@gmail.com", "Marketing", 60000.0, "Mumbai", "Marketing Executive", "9876543216"));

		map.put(8, new Employee(8, "Pooja", "pooja@gmail.com", "Finance", 72000.0, "Kolhapur", "Financial Analyst", "9876543217"));

		map.put(9, new Employee(9, "Kiran", "kiran@gmail.com", "IT", 95000.0, "Pune", "Team Lead", "9876543218"));

		map.put(10, new Employee(10, "Akash", "akash@gmail.com", "HR", 58000.0, "Satara", "HR Executive", "9876543219"));
		
//		map.forEach((id, name) -> {
//			System.out.println(id+" : "+name);
//		});
		
//		// Salary greater than ₹70,000
//		System.out.println("Salary greater than ₹70,000 : ");
//		map.values()
//		.stream()
//		.filter(emp -> emp.getSalary() > 70000)
//		.forEach(emp -> System.out.println(emp));
//		
//		// Salary less than ₹70,000
//		System.out.println("===========================");
//		System.out.println("Salary less than ₹70,000");
//		map.values()
//		.stream()
//		.filter(e -> e.getSalary() < 70000)
//		.forEach(em -> System.out.println(em));
//	
//		// Salary between ₹60,000 and ₹80,000
//		System.out.println("Salary between ₹60,000 and ₹80,000 :");
//		map.values()
//		.stream()
//		.filter(emp -> emp.getSalary() >= 55000 && emp.getSalary() <= 75000)
//		.forEach(e -> System.out.println(e));
		
		// Filter salary and print only name + salary
		
		map.values()
		.stream()
		.filter(emp -> emp.getSalary() > 75000)
		.forEach(emp -> System.out.println(emp.getName() + " : "+emp.getSalary()));
		
		
	}
}

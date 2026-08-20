package com.day19.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		 map.put(101, new Employee(101, "Rahul", "Pune", "IT", 55000.0, "rahul@gmail.com", "9876543210"));

	     map.put(102, new Employee(102, "Amit", "Mumbai", "HR", 48000.0, "amit@gmail.com", "9876543211"));

	     map.put(103, new Employee(103, "Priya", "Nashik", "Finance", 62000.0, "priya@gmail.com", "9876543212"));

	     map.put(104, new Employee(104, "Sneha", "Pune", "IT", 70000.0, "sneha@gmail.com", "9876543213"));

	     map.put(105, new Employee(105, "Vijay", "Sangli", "Sales", 45000.0, "vijay@gmail.com", "9876543214"));

	     map.put(106, new Employee(106, "Neha", "Kolhapur", "HR", 52000.0, "neha@gmail.com", "9876543215"));

	     map.put(107, new Employee(107, "Rohit", "Satara", "IT", 68000.0, "rohit@gmail.com", "9876543216"));

	     map.put(108, new Employee(108, "Pooja", "Pune", "Finance", 59000.0, "pooja@gmail.com", "9876543217"));

	     map.put(109, new Employee(109, "Suresh", "Mumbai", "Sales", 47000.0, "suresh@gmail.com", "9876543218"));

	     map.put(110, new Employee(110, "Kiran", "Nashik", "IT", 75000.0, "kiran@gmail.com", "9876543219"));

	     // maximum/minimum salary, and sorting employees by salary.
	     
//	     map.forEach((id, name) -> {
//	    	 System.out.println(id+" : "+name);
//	     });
	     
	     // Map<Integer, Employee> map, Maximum Salary
	     
//	     Employee max =
//			     map.values()
//			     .stream()
//			     .max((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()))
//			     .get();
//	     
//	     System.out.println(max);
	     
	     // Sorting Employees by Salary — Ascending
	     System.out.println("Ascending Order : ");
	     map.values()
	     .stream()
	     .sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()))
	     .forEach(System.out::println);
	     
	     System.out.println(" Descending order : ");
	     
	     // Sorting Employees by Salary — Descending
	     map.values()
	     .stream()
	     .sorted((e1, e2) -> e2.getSalary().compareTo(e1.getSalary()))
	     .forEach(System.out::println);
	     
	     
	}	
}

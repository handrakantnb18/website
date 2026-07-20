package com.day15.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		List<Employee> employee = Arrays.asList(
				new Employee(1001, "Rahul", "rahul@gmail.com", "9876541230", "IT", 450000.00),
				  new Employee(1001, "Rahul",   "rahul@gmail.com",   "9876541230", "IT",      450000.00),
			        new Employee(1002, "Amit",    "amit@gmail.com",    "9876541231", "HR",      350000.00),
			        new Employee(1003, "Sachin",  "sachin@gmail.com",  "9876541232", "Finance", 550000.00),
			        new Employee(1004, "Neha",    "neha@gmail.com",    "9876541233", "IT",      400000.00),
			        new Employee(1005, "Priya",   "priya@gmail.com",   "9876541234", "Admin",   300000.00),
			        new Employee(1006, "Kiran",   "kiran@gmail.com",   "9876541235", "Testing", 380000.00),
			        new Employee(1007, "Pooja",   "pooja@gmail.com",   "9876541236", "HR",      420000.00),
			        new Employee(1008, "Rohit",   "rohit@gmail.com",   "9876541237", "IT",      600000.00),
			        new Employee(1009, "Anjali",  "anjali@gmail.com",  "9876541238", "Support", 320000.00),
			        new Employee(1010, "Vikas",   "vikas@gmail.com",   "9876541239", "DevOps",  500000.00)

				);
		
		Map<Integer, Double> map = employee.stream()
				.collect(Collectors.toMap(
						Employee::getId,
						Employee::getSalary));
		
		map.forEach((id, name)
				-> System.out.println(id + " : "+ name));
		
	}
}

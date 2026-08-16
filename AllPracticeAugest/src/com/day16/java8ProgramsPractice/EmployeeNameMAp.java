package com.day16.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// Map<Integer, Employee> example with 10 employees:
public class EmployeeNameMAp {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(101, new Employee(101, "Rahul", "rahul@gmail.com", "IT", "50000", "9876543210", "Pune"));

        map.put(102, new Employee(102, "Amit", "amit@gmail.com", "HR", "45000", "9876543211", "Mumbai"));

        map.put(103, new Employee(103, "Sneha", "sneha@gmail.com", "Finance", "55000", "9876543212", "Nashik"));

        map.put(104, new Employee(104, "Priya", "priya@gmail.com", "IT", "60000", "9876543213", "Pune"));

        map.put(105, new Employee(105, "Vijay", "vijay@gmail.com", "Sales", "48000", "9876543214", "Kolhapur"));

        map.put(106, new Employee(106, "Neha", "neha@gmail.com", "HR", "52000", "9876543215", "Satara"));

        map.put(107, new Employee(107, "Rohit", "rohit@gmail.com", "IT", "65000", "9876543216", "Pune"));

        map.put(108, new Employee(108, "Pooja", "pooja@gmail.com", "Finance", "58000", "9876543217", "Sangli"));

        map.put(109, new Employee(109, "Akash", "akash@gmail.com", "Sales", "47000", "9876543218", "Solapur"));

        map.put(110, new Employee(110, "Kiran", "kiran@gmail.com", "IT", "70000", "9876543219", "Pune"));
		
		map.forEach((id, name) -> {
			System.out.println(id+ " : "+name);
		});
		
		
	}
}

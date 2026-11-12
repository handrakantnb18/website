package com.day11.java;

import java.util.HashMap;
import java.util.Map;


public class EmployeeMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();

		map.put(1, new Employee(101, "Ram", "ram@gmail.com", 88000.00, "Pune", "IT"));

		map.put(2, new Employee(102, "Chandrakant", "chandrakant@gmail.com", 99000.00, "Pune", "IT"));

		map.put(3, new Employee(103, "Amit", "amit@gmail.com", 77000.00, "Mumbai", "Sales"));

		map.put(4, new Employee(104, "Rahul", "raul@gmail.com", 66000.00, "Hydrabad", "Marketing"));

		map.put(5, new Employee(105, "Ajit", "ajit@gmail.com", 79000.00, "Banglore", "Admin"));

		map.put(6, new Employee(106, "Keatn", "ketan@gmail.com", 55000.00, "Delhi", "IT"));

		// get all employees details

		// map.forEach((id, name) -> System.out.println(name));

		// Find customers balance greater than 50000

      map.values()
         .stream()
         .filter(customer -> customer.getSalary() > 50000)
         .forEach(System.out::println);
 

		// Find Customers from Pune City

//		Map<Integer, Bank> result = 
//				map.entrySet().stream()
//				.filter(entry -> entry.getValue()
//						.getCity().equalsIgnoreCase("Pune"))
//				.collect(Collectors.toMap
//						(Map.Entry::getKey, 
//								Map.Entry::getValue));
//
//		result.forEach((key, value) -> 
//		System.out.println(key + " = " + value));

	}
}

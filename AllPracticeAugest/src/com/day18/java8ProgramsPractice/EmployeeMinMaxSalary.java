package com.day18.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMinMaxSalary {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(101, new Employee(101, "Rahul", "rahul@gmail.com", "IT", 55000.0, "9876543210", "Pune"));

	    map.put(102, new Employee(102, "Amit", "amit@gmail.com", "HR", 45000.0, "9876543211", "Mumbai"));

	    map.put(103, new Employee(103, "Priya", "priya@gmail.com", "Finance", 60000.0, "9876543212", "Nashik"));

	    map.put(104, new Employee(104, "Sneha", "sneha@gmail.com", "IT", 65000.0, "9876543213", "Pune"));

	    map.put(105, new Employee(105, "Vijay", "vijay@gmail.com", "Sales", 48000.0, "9876543214", "Sangli"));

	    map.put(106, new Employee(106, "Neha", "neha@gmail.com", "HR", 52000.0, "9876543215", "Kolhapur"));

	    map.put(107, new Employee(107, "Rohit", "rohit@gmail.com", "IT", 70000.0, "9876543216", "Satara"));

	    map.put(108, new Employee(108, "Pooja", "pooja@gmail.com", "Finance", 58000.0, "9876543217", "Nagar"));

	    map.put(109, new Employee(109, "Suresh", "suresh@gmail.com", "Sales", 50000.0, "9876543218", "Aurangabad"));

	    map.put(110, new Employee(110, "Kiran", "kiran@gmail.com", "IT", 75000.0, "9876543219", "Mumbai"));

	    // Map<Integer, Employee>, you can find maximum and minimum salary
	    
	    Employee maxSal = 
			    map.values()
			    .stream()
			    .max((e1, e2) -> Double.compare(
			    		e1.getSalary(), e2.getSalary()))
			    .orElse(null);
	    
	    System.out.println("Maximum salary Employee : "+maxSal);

	    Employee minSal =
				map.values()
				.stream()
				.min((a1, a2) -> Double.compare(a1.getSalary(), a2.getSalary()))
				.orElse(null);
		
		System.out.println("Employee Minimum Salary : "+minSal);
		
	}	
	
	
}

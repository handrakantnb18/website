package com.day7.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

import com.day6.java8ProgramsPractice.Employee;

public class EmployeeAllList {

	public static void main(String[] args) {
		
		Map<Integer, Employee> list = new HashMap<Integer, Employee>();
		
		 list.put(101, new Employee(101, "Amit", "amit@gmail.com", "IT", "50000", "9876543210"));

	        list.put(102, new Employee(102, "Rahul", "rahul@gmail.com", "HR", "45000", "9876543211"));

	        list.put(103, new Employee(103, "Priya", "priya@gmail.com", "Finance", "60000", "9876543212"));

	        list.put(104, new Employee(104, "Sneha", "sneha@gmail.com", "IT", "55000", "9876543213"));

	        list.put(105, new Employee(105, "Vijay", "vijay@gmail.com", "Sales", "48000", "9876543214"));

	        list.put(106, new Employee(106, "Neha", "neha@gmail.com", "HR", "52000", "9876543215"));

	        list.put(107, new Employee(107, "Rohit", "rohit@gmail.com", "IT", "65000", "9876543216"));

	        list.put(108, new Employee(108, "Pooja", "pooja@gmail.com", "Finance", "58000", "9876543217"));

	        list.put(109, new Employee(109, "Suresh", "suresh@gmail.com", "Sales", "47000", "9876543218"));

	        list.put(110, new Employee(110, "Kiran", "kiran@gmail.com", "IT", "70000", "9876543219"));

	        list.forEach((id, sum) ->System.out.println(id+" "+sum));
	        
	        
	        
	}
}

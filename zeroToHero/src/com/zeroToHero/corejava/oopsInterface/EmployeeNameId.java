package com.zeroToHero.corejava.oopsInterface;

import java.util.Arrays;
import java.util.List;

public class EmployeeNameId {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
		        new Employee(101, "Amit Sharma", "9874561230", "amit@gmail.com", "Pune", "IT"),
		        new Employee(102, "Priya Patil", "9874561231", "priya@gmail.com", "Mumbai", "HR"),
		        new Employee(103, "Rahul Verma", "9874561232", "rahul@gmail.com", "Nagpur", "Finance"),
		        new Employee(104, "Sneha Kulkarni", "9874561233", "sneha@gmail.com", "Nashik", "Sales"),
		        new Employee(105, "Rohit Joshi", "9874561234", "rohit@gmail.com", "Kolhapur", "Marketing"),
		        new Employee(106, "Pooja Deshmukh", "9874561235", "pooja@gmail.com", "Aurangabad", "IT"),
		        new Employee(107, "Vikas Jadhav", "9874561236", "vikas@gmail.com", "Solapur", "Support"),
		        new Employee(108, "Neha Chavan", "9874561237", "neha@gmail.com", "Satara", "Admin"),
		        new Employee(109, "Kiran Pawar", "9874561238", "kiran@gmail.com", "Sangli", "Testing"),
		        new Employee(110, "Anjali More", "9874561239", "anjali@gmail.com", "Pune", "Development")
		);
		
		list.forEach(name -> System.out.println(name));
		
	}
}

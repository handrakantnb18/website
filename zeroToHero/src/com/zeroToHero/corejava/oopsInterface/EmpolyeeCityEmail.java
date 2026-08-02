package com.zeroToHero.corejava.oopsInterface;

import java.util.HashMap;
import java.util.Map;

public class EmpolyeeCityEmail {

	public static void main(String[] args) {
		
		Map<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		emp.put(101, new Employee(101, "Amit Sharma", "9874561230", "amit@gmail.com", "Pune", "IT"));
		emp.put(102, new Employee(102, "Priya Patil", "9874561231", "priya@gmail.com", "Mumbai", "HR"));
		emp.put(103, new Employee(103, "Rahul Verma", "9874561232", "rahul@gmail.com", "Nagpur", "Finance"));
		emp.put(104, new Employee(104, "Sneha Kulkarni", "9874561233", "sneha@gmail.com", "Nashik", "Sales"));
		emp.put(105, new Employee(105, "Rohit Joshi", "9874561234", "rohit@gmail.com", "Kolhapur", "Marketing"));
		emp.put(106, new Employee(106, "Pooja Deshmukh", "9874561235", "pooja@gmail.com", "Aurangabad", "IT"));
		emp.put(107, new Employee(107, "Vikas Jadhav", "9874561236", "vikas@gmail.com", "Solapur", "Support"));
		emp.put(108, new Employee(108, "Neha Chavan", "9874561237", "neha@gmail.com", "Satara", "Admin"));
		emp.put(109, new Employee(109, "Kiran Pawar", "9874561238", "kiran@gmail.com", "Sangli", "Testing"));
		emp.put(110, new Employee(110, "Anjali More", "9874561239", "anjali@gmail.com", "Pune", "Development"));
		
		emp.entrySet().forEach(entry -> {
			System.out.println(entry.getKey()+ " : "+entry.getValue());
		});
		
	}
}

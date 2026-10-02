package com.day1.javaProgramsPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalary {

	public static void main(String[] args) {

		Map<Integer, EmployeeOct> map1 = new HashMap<Integer, EmployeeOct>();

		map1.put(1, new EmployeeOct(101, "chandrakant", "chandrakant@gmail.com", 80000.00, "IT", "Pune", "software engineer"));

		map1.put(2, new EmployeeOct(102, "priya", "priya@gmail.com", 55000.00, "Trans", "Mumbai", "managaer"));

		map1.put(3, new EmployeeOct(103, "Pooja", "pooja@gmail.com", 85000.00, "HR", "Pune", "Admin"));

		map1.put(4, new EmployeeOct(104, "Amit", "amit@gmail.com", 60000.00, "HR", "Mumbai", "managaer"));

		map1.put(5, new EmployeeOct(105, "Vijay", "vijay@gmail.com", 95000.00, "IT", "Pune", "Sales"));

		map1.put(6, new EmployeeOct(106, "Ram", "ram@gmail.com", 87000.00, "Trans", "Mumbai", "managaer"));

		// System.out.println(map1);
		
		map1.forEach((id, name) -> {
			System.out.println(id+" "+name);
		});
		
		
//		map1.forEach((id, sal) -> {
//			if(sal.getSalary() < 60000)
//				System.out.println(sal);
//		});
		
		
	}
}

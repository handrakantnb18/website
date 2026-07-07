package com.throwcustome.exception;

import java.util.Scanner;

public class EmployeeDemo {

	void employeeDemo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee : ");
		
		String emp = sc.next();
		
		if(String e : emp)
		{
			throw new EmployeeNotFoundException("Employee not found");
		}
		else
		{
			System.out.println("Employee Found");
		}
	}
	public static void main(String[] args) {
		
		EmployeeDemo ed = new EmployeeDemo();
		
		ed.employeeDemo();
		
		
	}
}

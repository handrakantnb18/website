package com.day27.java8ProgramsPractice;

public class SQLHighSalary {

	public static void main(String[] args) {
		
//		SELECT department,
//			employee_name,
//			salary
//		FROM(
//				SELECT department,
//				employee_name,
//				salary,
//				DENSE_RANK() OVER(
//						PARTITION BY department
//						ORDER BY salary DESC
//						) AS salary_rank
//				FROM employee
//				) t
//		WHERE salary_rank = 2;
	
		// f you want to create a Department table for your employee/SQL practice, use:
		
//		CREATE TABLE department (
//			    dept_id INT PRIMARY KEY AUTO_INCREMENT,
//			    dept_name VARCHAR(100) NOT NULL
//			);
		
		// Insert sample departments
		
//		INSERT INTO department (dept_name) VALUES
//		('IT'),
//		('HR'),
//		('Finance'),
//		('Sales'),
//		('Marketing');
		
		// Check data
//		SELECT * FROM department;
		
		// Output:
		
//		1   IT
//		2   HR
//		3   Finance
//		4   Sales
//		5   Marketing
		
	}
}

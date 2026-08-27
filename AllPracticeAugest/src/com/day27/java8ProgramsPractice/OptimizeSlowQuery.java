package com.day27.java8ProgramsPractice;

public class OptimizeSlowQuery {

	public static void main(String[] args) {
		
		// SQL: How would you identify and optimize a slow query? Explain indexes and execution plans.
		
		// Check the Execution Plan
		
//		EXPLAIN 
//		SELECT *
//		FROM employee
//		WHERE DEPT_ID = 10
//		AND salary > 5000;
		
		// For newer MySQL versions, I can also use:
		
//		EXPLAIN ANALYZE
//		SELECT * 
//		FROM employee
//		WHERE dept_id = 10
//		AND salary > 5000;
//		
		// Suppose we frequently execute:
		// Without an index, the database may scan many rows.
		
//		SELECT *
//		FROM employee
//		WHERE email = 'rahul@gmail.com';
		
		// Now the database can use the index to locate matching rows much faster.
		
//		CREATE INDEX idx_employee_email
//		ON employee(email);
		
		// A composite index may help:
		// The column order matters. Index design should match the query patterns rather than simply indexing every column.

//		CREATE INDEX idx_employee_dept_salary
//		ON employee(dept_id, salary);
		
		// Depending on the database/optimizer, applying a function can prevent efficient use of an index.
		
//		SELECT *
//		FROM employee
//		WHERE join_date >= '2025-01-01'
//		AND join_date < '2026-01-01';
		
		// Increase INSERT/UPDATE/DELETE overhead
		
		
	}
}

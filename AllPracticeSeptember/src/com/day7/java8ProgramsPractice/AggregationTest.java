package com.day7.java8ProgramsPractice;

class Department {
	String deptName;

	Department(String deptName) {
		this.deptName = deptName;
	}
}

class University {
	String universityName;
	Department department;

	University(String universityName, Department department) {
		this.universityName = universityName;
		this.department = department;
	}

	void showDetails() {
		System.out.println("University: " + universityName);
		System.out.println("Department: " + department.deptName);
	}
}


public class AggregationTest {

	public static void main(String[] args) {

		 Department dept = new Department("Computer Applications");  
	        University uni = new University("Pune University", dept);  
	  
	        uni.showDetails();  
	        
	}
}

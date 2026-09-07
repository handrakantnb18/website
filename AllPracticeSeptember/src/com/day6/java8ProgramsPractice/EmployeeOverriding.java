package com.day6.java8ProgramsPractice;

public class EmployeeOverriding extends EmployeeOverridingTwo {

	void sub(int c, int d) {
		
		System.out.println(c + d);
//		super.add(c, d);
		/*
		 * c = 55; d = 30;
		 */
	}
	
	public static void main(String[] args) {
		
		EmployeeOverriding ep = new EmployeeOverriding();
		ep.sub(20, 10);
		ep.add(40, 30);
		
	}
}

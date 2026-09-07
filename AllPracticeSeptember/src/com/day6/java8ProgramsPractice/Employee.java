package com.day6.java8ProgramsPractice;

public class Employee {

	// method overloading
	public void display(int a, int b, int c)
	{
		
		/*
		 * a = 20; b = 25;
		 */
		 
		System.out.println(c = a +b);
	}
	
	public void dispaly(int age, String name) {
		System.out.println("Display age and name : ");
		
		
		System.out.println(age+ " "+name);
		
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.display(10, 20, 30);
		
		e.dispaly(26, "Ram");
		
	}
}

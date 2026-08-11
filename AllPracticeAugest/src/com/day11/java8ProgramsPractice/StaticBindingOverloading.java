package com.day11.java8ProgramsPractice;

// In Java, binding refers to the process of linking a method call to its corresponding method body
public class StaticBindingOverloading {

	public static class ParentClass {
		static void print()
		{
			System.out.println("Print() method of the parent class is invoked");
		}
	}
	
	public static class ChildClass extends ParentClass {
		
		static void print()
		{
			System.out.println("Print() method of the child class is invoked.");
		}
	}
	
	public static void main(String[] args) {
		
		ParentClass objP = new ParentClass();
		
		ParentClass objJ = new ParentClass();
		
		objP.print();
		objJ.print();
	}
}

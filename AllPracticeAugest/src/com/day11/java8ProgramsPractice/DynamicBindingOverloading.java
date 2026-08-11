package com.day11.java8ProgramsPractice;

// In dynamic binding, the compiler does not decide the method to be invoked.

public class DynamicBindingOverloading {

	public static class ParentClass{
		void print() {
			System.out.println("print() method of the parent class is invoked");
		}
	}
	
	public static class ChildClass extends ParentClass{
		
		void print() {
			System.out.println("print() method of the child class is invoked");
		}
	}
	
	public static void main(String[] args) {
		
		ParentClass objPC =new ParentClass();
		
		ParentClass objPJ = new ParentClass();
		
		objPC.print();
		objPJ.print();
	}
}

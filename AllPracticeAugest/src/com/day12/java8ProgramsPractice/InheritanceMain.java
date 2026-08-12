package com.day12.java8ProgramsPractice;

// demonstrate the single inheritance in Java, where the Programmer
// class inherits the salary variable from the Employee class and also 
// defines its own bonus.

class EmployeeInh{
	float salary = 2000;
}

class Programaa extends EmployeeInh{
	int bonus = 1000;
}

public class InheritanceMain {

	public static void main(String[] args) {
		
		Programaa p = new Programaa();
		System.out.println("Programmer salary : "+p.salary);
		
		System.out.println("Bonus of Programmer is : "+p.bonus);
	}
}

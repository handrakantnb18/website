package com.day10.java8ProgramsPractice;

// When a variable is declared as final, it is known
// as a final variable. Its value cannot be changed 
// once initialized. It behaves like a constant.

public class FinalMethodVariables {

	final String University = "Pune university, pune";
	final int TotalStudents = 450;
	
	void run() {
		// TotalStudents = 450; // we cannot change the final variable
	}
	public static void main(String[] args) {
		
		FinalMethodVariables obj = new FinalMethodVariables();
		obj.run();
		
	}
}

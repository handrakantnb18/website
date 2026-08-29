package com.day29.java8ProgramsPractice;

public class CallStackHandle {

	// When an Exception occurs, the JVM creates 
	// an exception object containing the error name
	// description, and program state.
	public static void main(String[] args) {
		
		// NullPointerException
		String s = null;
		
		System.out.println(s.length());
	}
}

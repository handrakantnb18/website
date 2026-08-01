package com.zeroToHero.corejava.oopsConcepts;

public class UserDefinedMethod {

	static void greet() {
		System.out.println("Hello from the static method");
	}
	
	void farewell() {
		System.out.println("Goodbye from a non-static method.");
		
	}
	
	public static void main(String[] args) {
		
		UserDefinedMethod udm = new UserDefinedMethod();
		udm.farewell();
		UserDefinedMethod.greet();
		
	}
}

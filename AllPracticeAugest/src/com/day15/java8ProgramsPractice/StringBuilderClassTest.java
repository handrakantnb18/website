package com.day15.java8ProgramsPractice;

public class StringBuilderClassTest {

	public static void main(String[] args) {
		
		// Using the Java StringBuilder Class
		String firstName = "Shivraj";
		String lastName = "Bhosale ";
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(" Hello ");
		
		stringBuilder.append(firstName);
		
		stringBuilder.append(" ");
		stringBuilder.append(lastName);
		
		String result = stringBuilder.toString();
		System.out.println("Concat() method : "+result);
		
		// join() method
		String res = String.join(" ", firstName, lastName);
		System.out.println("Join() method : "+res);
		
		
	}
}

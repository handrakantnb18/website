package com.day6.java8ProgramsPractice;

public class StringImmutables {

	public static void main(String[] args) {
		
		// String is a sequence of characters
		// String is a immutable its can not change, or modify its thread safety
		// if you want to change to create new string the value will be change automatically
		// String create by Literal
		// using new keyword
		// Security, thread safe, 
		// ex username for login
		
		String s = "AMit";
		s.concat("Patil");
		System.out.println(s);
		
		String a = new String("Ajit");
		a.concat("Mane");
		System.out.println(a);
		
	}
}

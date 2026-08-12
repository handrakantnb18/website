package com.day12.java8ProgramsPractice;

// Using recursion (without built-in reverse methods)

public class ReverseStringWithoutBuiltIn {

	public static String rev(String str) {
		if(str.isEmpty()) {
		return str;	
		}
		
		return rev(str.substring(1)) + str.charAt(0);
		}
	public static void main(String[] args) {
		
		System.out.println(rev("Hello"));
	}
}

package com.day14.java8ProgramsPractice;

public class StringMemoryAllocationTest {

	public static void main(String[] args) {
		
		// String literals - stored in the string pool
		String s1 = "ram";
		String s2 = "ram";
		
		System.out.println("s1 == s2 : "+(s1 == s2));
		
		// Strings created with 'new' - stored in heap memory outside the string pool
		String s3 = new String("String");
		String s4 = new String("String");
		
		System.out.println("s3 == s4 : "+(s3 == s4));
		
		String s5 = s3.intern();
		
		// Checking if str1 and str5 point to the same object  
		System.out.println("s1 == s5 : "+(s1 == s5));
		
		// Demonstrating the effect of interning on memory allocation
		String s6 = new String(" shyam").intern();
		
		// Checking if str6 is the same as str1 
		System.out.println("s1 == s6 : "+(s1 == s6));
		
		
	}
}

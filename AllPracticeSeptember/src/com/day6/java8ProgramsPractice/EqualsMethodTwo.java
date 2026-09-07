package com.day6.java8ProgramsPractice;

public class EqualsMethodTwo {

	public static void main(String[] args) {
		
		// == operator is used to compare primitive values and object reference.
		// check whether the value are equals
		// if value equals then store same memory address SCP
		
//		String s1 = "Chandra";
		
		String s1 = "Ram";
		
		String s2 = "Ram";
		
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Ram");
		
		String s4 = new String("Ram");
		
		String s5 = new String("ram");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s3 == s4);
		
		// .equals() method check the objects of string
		System.out.println(s3.equals(s4));
		
		System.out.println(s3.equals(s5));
		
		// compare the actual value
		int a = 10;
		
		int b = 10;
		
		System.out.println(a == b);
		
	}
}

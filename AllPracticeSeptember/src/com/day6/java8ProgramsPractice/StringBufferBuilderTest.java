package com.day6.java8ProgramsPractice;

public class StringBufferBuilderTest {

	public static void main(String[] args) {
		
		// StringBuffer
		// SB is a synchronized, 
		// thread safe
		// we can not call two threads simultaneously
		// less efficient
		
		// StringBuilder
		// SB is a non-synchronized
		// not-thread safe
		// means we can call two or more threads simultaneously
		
	
		StringBuilder sb = new StringBuilder("ABC");
		sb.append(" DEF");
		System.out.println("String Builder : "+sb);
		System.out.println("String Builder : "+sb);
		System.out.println("String Builder : "+sb);
		
		StringBuffer s = new StringBuffer("GHI");
		s.append(" JKL");
		System.out.println("String Buffer : "+s);
		System.out.println("String Buffer : "+s);
		System.out.println("String Buffer : "+s);
		
	}
}

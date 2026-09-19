package com.day19.java8ProgramsPractice;

//StringBuffer is similar to StringBuilder but thread-safe
// It also provides the reverse() method.

public class ReverseStringTestFive {

	public static void main(String[] args) {
		
		String str = "chandrakantbhosale";
		
		StringBuffer sbf = new StringBuffer(str);
		
		sbf.reverse();
		
		System.out.println(sbf);
		
	}
}

package com.day19.java8ProgramsPractice;

// StringBuilder provides a built-in reverse() 
// method, making string reversal quick and efficient

public class ReverseStringTestTwo {

	public static void main(String[] args) {
		
		String str = "chandrakant";
		
		StringBuilder res = new StringBuilder();
		
		res.append(str);
		
		res.reverse();
		
		System.out.println(res);
		
	}
}

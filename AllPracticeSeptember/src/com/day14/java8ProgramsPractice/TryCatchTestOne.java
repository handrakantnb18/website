package com.day14.java8ProgramsPractice;

// If an error occurs, we can use try...catch to 
// catch the error and execute some code to handle it:

public class TryCatchTestOne {

	public static void main(String[] args) {
		
		try {
		int[] num = {1,2,3,4,5,6,7,8,9};
		System.out.println(num[10]);
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
	}
}

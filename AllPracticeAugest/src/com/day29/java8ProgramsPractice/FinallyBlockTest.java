package com.day29.java8ProgramsPractice;

public class FinallyBlockTest {

	public static void main(String[] args) {
		
		// The finally block executes after the try and catch blocks in most situations
		// finally block always executes.
		int[] a1 = {10, 20, 30, 40, 50};
		try
		{
			System.out.println(a1[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception catch : "+e);
		}
		finally {
			System.out.println("This block always executes..");
		}
		System.out.println("Program continuees....");
	}
}

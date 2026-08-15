package com.zeroToHero.exception;

public class UncheckedExceptionTest {
//Caught ArrayIndexOutOfBoundsException: Index 5 out of bounds for
	
	public static void main(String[] args) {
		//NullPointerException  
		String str = null;
		
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException : "+e.getMessage());
		}
		
		// ArrayIndexOutOfBoundsException  
		int[] arr = {1,2,3,4,5,6};
		
		try {
			System.out.println(arr[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Catch ArrayIndex OutOfBoundsException : "+e.getMessage());
		}
		
		// ArithmeticException
		try {
			int result = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmaticException : "+e.getMessage());
		}
	}
}

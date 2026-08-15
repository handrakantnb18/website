package com.zeroToHero.exception;

public class ArithmeticExceptionTest {

	//May raise ArithmeticException
	// use of exception handling
	public static void main(String[] args) {
		
		try {
			int data = 100 / 0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of code.");
	}
}

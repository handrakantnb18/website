package com.zeroToHero.exception;

public class FinallyBlocksTest {
	//Java Program to illustrate the use of finally block  
	
	public static void main(String[] args) {
		
		//Division by zero is not allowed.
		try {
		int data = 25 /0;
		System.out.println("Result : "+data);
		}catch(ArithmeticException e) {
			System.out.println("Divid by zero is not allowed.");
		}finally {
			System.out.println("This block always excutes.");
		}
		
		System.out.println("Program counting after finally blocks..");
	}
}

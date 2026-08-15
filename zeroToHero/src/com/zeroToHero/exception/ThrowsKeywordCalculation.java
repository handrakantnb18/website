package com.zeroToHero.exception;

// the use of the throws keyword to declare an exception and handle it 
// in the calling method using a try-catch block.

public class ThrowsKeywordCalculation {

	public static int divideNum(int m, int n) throws ArithmeticException{
		
		int div = m / n;
		return div;
	}
	
	public static void main(String[] args) {
		
		ThrowsKeywordCalculation th = new ThrowsKeywordCalculation();
		
		try {
			System.out.println(th.divideNum(45, 0));
		}
		catch(ArithmeticException e) {
			System.out.println("Number cannot divided by 0");
		}
		
		System.out.println("Rest of the code....");
	}
}

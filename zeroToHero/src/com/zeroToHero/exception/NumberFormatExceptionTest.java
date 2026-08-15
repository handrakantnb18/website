package com.zeroToHero.exception;

//  A scenario where NumberFormatException occurs
public class NumberFormatExceptionTest {

	public static void main(String[] args) {
		
		String str = "chanr";
		
		
		try {
			
			// Attempting to parse a non-numeric string to an integer
			int num = Integer.parseInt(str);
			System.out.println("Parsed int : "+num);
		}catch(NumberFormatException e) {
			System.out.println("Unable to parse the string as an integer.");
		}
	}
}

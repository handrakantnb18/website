package com.day4.java17features;

public class ThrowKeywordOne {

	//  the throws keyword with a single exception:
	static void checkAge(int age) throws ArithmeticException {  
        if (age < 18) {  
            throw new ArithmeticException("Not eligible to vote");  
        }  
        System.out.println("Eligible to vote");  
    }  
	
	public static void main(String[] args) {
		
		 try {  
	            checkAge(15);  
	        } catch (ArithmeticException e) {  
	            System.out.println("Exception caught: " + e.getMessage());  
	        }  
	    
	}
}

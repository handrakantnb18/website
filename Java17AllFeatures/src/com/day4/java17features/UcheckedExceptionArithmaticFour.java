package com.day4.java17features;

// Method m throws an ArithmeticException (division by zero)

public class UcheckedExceptionArithmaticFour {

	 void m() {  
	        int a=50;
	        int b=a/0; 
	 }
	 
	 void n() {  
	        m(); 
	        
	 }
	 void p() {  
	        try {  
	            n();
	        }
	        catch (Exception e) {  
	            System.out.println("exception handled"); 
	            
	        }
	 }  
	 
	public static void main(String[] args) {
		
		UcheckedExceptionArithmaticFour obj = new UcheckedExceptionArithmaticFour();
		obj.p();
	}
}

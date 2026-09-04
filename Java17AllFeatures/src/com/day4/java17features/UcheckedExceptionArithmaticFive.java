package com.day4.java17features;

// // Method m throws a checked exception, so it must declare it with throws
import java.io.*;

public class UcheckedExceptionArithmaticFive {

	void m() throws IOException {  
        throw new IOException("device error");
	}
	
	void n() throws IOException {  
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
		
		UcheckedExceptionArithmaticFive o = new UcheckedExceptionArithmaticFive();
		
		o.p();
		
		System.out.println("normal flow");
	}
}

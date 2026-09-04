package com.day4.java17features;

import java.io.*;  

// class represents a user-defined exception    

class UserDefinedException extends Exception  {    
    public UserDefinedException(String str)  {    
          
        super(str);    
    }    
}   

public class UcheckedExceptionArithmaticThree extends Exception {

	 
	public static void main(String[] args) {
		
		try {
			 throw new UserDefinedException("This is user-defined exception");
		}
		catch(UserDefinedException e) {
			System.out.println("Caught the exception");
			
			System.out.println(e.getMessage());
		}
	}
}

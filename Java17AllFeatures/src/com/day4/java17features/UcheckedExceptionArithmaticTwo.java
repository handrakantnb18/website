package com.day4.java17features;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Every subclass of Error and RuntimeException is an unchecked exception in
//Java. A checked exception is everything else under the Throwable class.


public class UcheckedExceptionArithmaticTwo {

	public static void method() throws FileNotFoundException {
		FileReader file = new FileReader("C:\\Users\\Desktop\\abc.txt");
		BufferedReader fileInput = new BufferedReader(file);
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {

		 try  {    
	            method();    
	        }     
	        catch (FileNotFoundException e)     {    
	            e.printStackTrace();    
	        }    
	        System.out.println("rest of the code...");      
	          
	}

	
}

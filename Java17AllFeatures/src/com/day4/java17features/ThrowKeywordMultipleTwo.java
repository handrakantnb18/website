package com.day4.java17features;

import java.io.*;  

// demonstrates the throws keyword with multiple exceptions:

public class ThrowKeywordMultipleTwo {

	static void readFile(String fileName) throws IOException, FileNotFoundException {  
        FileReader file = new FileReader(fileName);  
        BufferedReader fileInput = new BufferedReader(file);  
        System.out.println(fileInput.readLine());  
        fileInput.close();  
    }  
	
	public static void main(String[] args) {
		
		try {  
            readFile("test.txt");  
        } catch (FileNotFoundException e) {  
            System.out.println("File not found: " + e.getMessage());  
        } catch (IOException e) {  
            System.out.println("IO Exception: " + e.getMessage());  
        }  
		
	}
}

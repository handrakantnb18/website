package com.day29.java8ProgramsPractice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

	// Method declares that it may throw IOException
	// It is mainly used with checked exceptions
	// it must declare that exception in its throws clause
	static void readFile(String fileName) throws IOException{
		try (FileReader file = new FileReader(fileName)) {
			int data;
			while((data = file.read()) != -1) {
				System.out.println((char) data);
			}
		}
	} //No need for finally block to close the resource
	
	public static void main(String[] args) {
		
		try {
			readFile("text.txt");
		}
		catch(IOException e) {
			System.out.println("File not found or error reading file : "+e.getMessage());
		}
		
		System.out.println("\nProgram countinues after file operations:");
	}
}

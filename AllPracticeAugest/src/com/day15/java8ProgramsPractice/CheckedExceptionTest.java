package com.day15.java8ProgramsPractice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {

// An IOException occurred: example.txt (No such file or directory)
	public static void main(String[] args) {
		
		try
		{
			File file = new File("file.txt");
			FileReader fr = new FileReader(file);
			System.out.println("File opened successfully.");
			fr.close();
			
			
		}catch (IOException e) {
			System.out.println("IOException is : "+e.getMessage());
		}
		
	}
}

package com.zeroToHero.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsMultipleExceptionTest {

	static void readFile(String fileName) throws IOException, FileNotFoundException{
		FileReader file = new FileReader(fileName);
		BufferedReader fileInput = new BufferedReader(file);
		System.out.println(fileInput.readLine());
		fileInput.close();
	}
	
	public static void main(String[] args) {
		
		try {
			readFile("text.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found : "+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("IO Exception : "+e.getMessage());
		}
	}
}

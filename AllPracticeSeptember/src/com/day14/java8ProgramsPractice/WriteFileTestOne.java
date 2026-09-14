package com.day14.java8ProgramsPractice;

import java.io.FileWriter;
import java.io.IOException;

// we use FileWriter together with its write() method to create
// and write some text into a file.

public class WriteFileTestOne {

	public static void main(String[] args) {

		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Files in Java might be tricky, " + "but it is fun enough!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}

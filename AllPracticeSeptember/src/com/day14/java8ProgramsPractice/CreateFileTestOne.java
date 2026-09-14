package com.day14.java8ProgramsPractice;

import java.io.File;
import java.io.IOException;

// a try...catch block. This is necessary because it throws an 
// IOException if an error occurs

public class CreateFileTestOne {

	public static void main(String[] args) {

		try {
			File myObj = new File("filename.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}

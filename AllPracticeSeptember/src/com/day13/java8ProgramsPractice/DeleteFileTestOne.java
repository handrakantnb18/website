package com.day13.java8ProgramsPractice;

import java.io.File;

public class DeleteFileTestOne {

	public static void main(String[] args) {

		File myObj = new File("filename.txt");
		if (myObj.delete()) {
			System.out.println("Deleted the file: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}
}

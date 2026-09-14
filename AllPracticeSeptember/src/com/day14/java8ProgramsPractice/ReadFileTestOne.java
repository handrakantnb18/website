package com.day14.java8ProgramsPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// we use the Scanner class to read the contents
// of the text file we created

public class ReadFileTestOne {

	public static void main(String[] args) {

		File myObj = new File("filename.txt");

		try (Scanner myReader = new Scanner(myObj)) {
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}

package com.day9.javaProgramsPractice;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

//Replace with the actual file path

public class StreamFileTestTwo {

	public static void main(String[] args) {

		String[] words = 
			{ "chandrakant", "bhosale", "priyanka", "keshav", "shivraj" };

		String fileName = "path/to/your/file.txt";

		try (PrintWriter pw = 
				new PrintWriter(Files.newBufferedWriter(Paths.get(fileName)))) {

			Stream.of(words).forEach(pw::println);

			System.out.println("Words written to the file successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

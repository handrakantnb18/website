package com.day15.java;

import java.io.*;

// Test yourself by guessing the output of the following code

public class MathTest2 {

	public static void main(String[] args) {
		try {
			throw new IOException("Ram Ram");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

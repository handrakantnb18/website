package com.day20.java8ProgramsPractice;

//This method works at the byte level and is useful 
//for encoding or low-level string manipulation

public class ReverseStringTestSeven {

	public static void main(String[] args) {

		String str = "priyankabhosale";

		byte[] arr = str.getBytes();

		byte[] res = new byte[arr.length];

		for (int i = 0; i < arr.length; i++)
			res[i] = arr[arr.length - i - 1];

		System.out.println(new String(res));

	}

}

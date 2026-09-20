package com.day20.java8ProgramsPractice;

//find the index of the first non-zero character and use substring() from that index.

public class RemoveZeroStringTestOne {

	static String removeLeadingZeros(String str) {

		int index = 0;

		while (index < str.length() && str.charAt(index) == '0') {
			index++;
		}

		if (index == str.length()) {
			return "0";
		}

		return str.substring(index);
	}

	public static void main(String[] args) {

		String str = "00000123569";

		System.out.println("Original String: " + str);
		System.out.println("String after removing leading zeros: " + removeLeadingZeros(str));

	}

}

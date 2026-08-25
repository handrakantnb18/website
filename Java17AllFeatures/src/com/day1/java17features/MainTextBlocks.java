package com.day1.java17features;

public class MainTextBlocks {

	public static void main(String[] args) {
		
		String json = """
				{
				"id": 101,
				"name": "Ram",
				"Skills":["Java", "Spring", "MySql"]
				}
				""";
		System.out.println(json);
	}
}

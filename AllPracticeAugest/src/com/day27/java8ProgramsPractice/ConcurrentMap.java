package com.day27.java8ProgramsPractice;

import java.util.concurrent.ConcurrentHashMap;

// Java program to illustrate ConcurrentHashMap

public class ConcurrentMap {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> con = new ConcurrentHashMap<Integer, String>();
		
		con.put(101, "Apple");
		con.put(102, "Mango");
		con.put(103, "Orange");
		con.put(104, "Graps");
		
		System.out.println(con);
		
		// Removing entry With Key and Value
		con.remove(104, "Graps");
		
		System.out.println(con);
		
		con.put(105, "Banana");
		
		System.out.println(con);
		
		// Replacing  Value of an entry
		con.replace(103, "Orange", "Finger");
		
		System.out.println(con);
		
	}
}

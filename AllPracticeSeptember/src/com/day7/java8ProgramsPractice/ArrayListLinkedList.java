package com.day7.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ajit");
		list.add("Pooja");
		list.add("Peter");
		list.add("Sharad");
		
		List<String> list1 = new LinkedList<String>();
		list1.add("Ashok");
		list1.add("Ajay");
		list1.add("Sayali");
		list1.add("Pruthvi");
		
		System.out.println("ArrayList : "+list);
		
		System.out.println("LinkedList : "+list1);
		
	}
}

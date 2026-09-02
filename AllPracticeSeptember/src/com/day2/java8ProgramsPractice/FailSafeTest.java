package com.day2.java8ProgramsPractice;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeTest {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("Ajit");
		list.add("sachin");
		list.add("Samay");
		list.add("Ram");
		list.add("Pooja");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
			
			if(name.equals("Ram") ) {
				list.add("Date");
				
			}
		}
		System.out.println(list);
		
	}
}

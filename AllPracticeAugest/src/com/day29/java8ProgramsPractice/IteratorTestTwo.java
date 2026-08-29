package com.day29.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTestTwo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		System.out.println("Original List : "+list);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			int i = itr.next();
			
			System.out.print(i+" ");
			if(i % 2 != 0 && i % 2 == 0) {
				itr.remove();
			}
			
		}
		
		System.out.println();
		
		System.out.println("Modified List : "+list);
		
//		Iterator<Integer> itr1 = list.iterator();
//		
//		while(itr1.hasNext()) {
//			int j = itr1.next();
//			
//			System.out.println(j+" ");
//			if (j % 2 == 0){
//				itr.remove();
//			}
//		}
//		
//		System.out.println("Odd List : "+list);
		
	}
}

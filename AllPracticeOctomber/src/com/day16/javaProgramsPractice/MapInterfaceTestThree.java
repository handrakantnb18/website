package com.day16.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;

// how to iterate through an ArrayList using the Iterator interface in Java

public class MapInterfaceTestThree {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		  list.add("Mango");    
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");    

		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());
		  }  
		  
	}
}

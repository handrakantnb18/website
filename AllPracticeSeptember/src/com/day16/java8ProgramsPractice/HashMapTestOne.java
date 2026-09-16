package com.day16.java8ProgramsPractice;

import java.util.*;

// we are using a non-generic Map and traversing it using Iterator.

public class HashMapTestOne {

	public static void main(String[] args) {
		
		Map map=new HashMap();  
		map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit"); 
	    map.put(8,"Jaikumar");  
	    map.put(4,"Ram");
	    
	    Set set = map.entrySet();
	    
	    Iterator itr = set.iterator();
	    
	    while(itr.hasNext()) {
	    	
	    	Map.Entry entry=(Map.Entry)itr.next();  
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    	
	    }
		
	}
}

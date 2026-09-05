package com.day5.java17features;

import java.util.ArrayList;
import java.util.Collections;

// how to sort user-defined objects by implementing the 
// Comparable interface and overriding the compareTo() method

class Student implements Comparable<Student> {
	public String name;
	
	public Student(String name)
	{
		 this.name = name; 
	}
	
	 public int compareTo(Student person) {  
		    return name.compareTo(person.name);  
		      
		  }   
}

public class UserDefinedTestOne {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("1. Viru"));  
	    list.add(new Student("2. Saurav"));  
	    list.add(new Student("3. Mukesh"));  
	    list.add(new Student("4. Ajay")); 
	    list.add(new Student("5. Ram"));
		
	    Collections.sort(list);
	    
	    for(Student s: list)
	    {
	    	System.out.println(s.name);
	    }
	    
	}
}

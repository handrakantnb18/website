package com.day15.java8ProgramsPractice;

// how to store and access user-defined class objects in an ArrayList.

import java.util.ArrayList;

class Student {  
    int rollno;  
    String name;  
    int age;  
  
    Student(int r, String n, int a) {  
        rollno = r;  
        name = n;  
        age = a;  
    }  
}  

public class ArrayListTestSix {

	public static void main(String[] args) {
		
		 ArrayList<Student> list = new ArrayList<>();  
		  
	        list.add(new Student(101, "Sonoo", 23));  
	        list.add(new Student(102, "Ravi", 21));  
	        list.add(new Student(103, "Hanumat", 25));  
	  
	        for (Student s : list) {  
	            System.out.println(s.rollno + " " + s.name + " " + s.age);  
	        }  
	}
}

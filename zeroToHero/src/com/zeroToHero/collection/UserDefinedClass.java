package com.zeroToHero.collection;

import java.util.ArrayList;

// User-defined Class Objects in ArrayList
// how to store and access user-defined class objects in an ArrayList.
class Student{
	int rollNo;
	String name;
	int age;
	
	Student(int r, String n, int a){
		rollNo = r;
		name= n;
		age = a;
		
	}
}

public class UserDefinedClass {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Ram", 23));
		list.add(new Student(102, "Amit", 20));
		list.add(new Student(103, "Amar", 30));
		list.add(new Student(104, "Chandr",25));
		list.add(new Student(105, "Shivraj", 21));
		
		for(Student s : list)
			System.out.println(s.rollNo+ " : "+s.name+" : "+s.age);
		
	}
}

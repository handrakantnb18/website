package com.day2.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

//Creating a class which implements Comparable Interface    

class Student  implements Comparable<Student>
{
	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Student st ) {
		if(age == st.age)
			return 0;
		else if(age > st.age)
			return 1;
		else
			return -1;
	}
}

// Comparable interface

public class ComparableMain {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(1, "Deepak", 20));
		al.add(new Student(2, "Pruthvi", 22));
		al.add(new Student(3, "John", 30));
		Collections.sort(al);
		
		for(Student st:al) {
			System.out.println(st.rollno+ " : "+st.name+" : "+st.age);
			
		}
	}
}

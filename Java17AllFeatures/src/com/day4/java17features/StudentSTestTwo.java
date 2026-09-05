package com.day4.java17features;

// we sort the list of elements that also contains null.

public class StudentSTestTwo {

	int rollno;
	String name;
	int age;

	StudentSTestTwo(int rollno,String name,int age){    
	    this.rollno=rollno;    
	    this.name=name;    
	    this.age=age;    
	    }

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

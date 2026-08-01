package com.zeroToHero.corejava.oopsConcepts;

// We can also create multiple objects and store information in them through a reference variable.

class Student11{
	
	int id;
	
	String name;
	
}

public class ReferenceVariables {

	public static void main(String[] args) {
		
		Student11 s1 = new Student11();
		
		Student11 s2 = new Student11();
		
		Student11 s3 = new Student11();
		
		s1.id = 101;
		s1.name = "chandrakant";
		
		s2.id = 102;
		s2.name = "Priyanka";
		
		s3.id = 103;
		s3.name = "Shivraj";
		
		System.out.println(s1.id+ " : "+s1.name);
		
		System.out.println(s2.id+ " : "+s2.name);
		
		System.out.println(s3.id+ " : "+s3.name);
		
	}
}

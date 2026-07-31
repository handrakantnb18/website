package com.zeroToHero.corejava;

 class Demo{
	
	 // instance variable
	 String name;
		
	 int age = 10;
	
	  public void InstanceVariableDemo()
	 {
		 this.name = "chandrakant";
	 }
	
}

public class VariableDemo {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		System.out.println("String Name : "+d.name);
		System.out.println("Local Variable Age : "+d.age);
		
		
	}
}

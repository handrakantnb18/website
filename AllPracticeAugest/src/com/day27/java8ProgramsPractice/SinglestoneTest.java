package com.day27.java8ProgramsPractice;

 class Singleton 
{
	private Singleton() {
		
    }
	
	private static class Holder {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return Holder.INSTANCE;
	}
}

public class SinglestoneTest {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
		
	}
}

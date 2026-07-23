package com.zeroToHero.core;

 class Thred implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Priyanka bhosale");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		
		Thred t = new Thred();
		t.run();
	}
}

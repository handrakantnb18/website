package com.day23.java;

// Locks only the critical section of code, not the entire method

class Counter1{

    private int c = 0;

    public void inc(){

        synchronized (this) { c++; }
    }

    public int get() { return c; }
}

public class SyncronizedBlockes {

	public static void main(String[] args)
	        throws InterruptedException{
	            
	        Counter1 cnt = new Counter1();

	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++)
	                cnt.inc();
	        });

	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++)
	                cnt.inc();
	        });

	        t1.start();
	        t2.start();
	        t1.join();
	        t2.join();

	        System.out.println("Counter1 : " + cnt.get());
	    }
	
}

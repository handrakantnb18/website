package com.zeroToHero.thread;

// web server can handle multiple client requests simultaneously by 
// assigning each request to a separate thread.
//multithreading for a web server handling multiple clients:

class ClientRequest extends Thread {
	private String clientName;
	
	public ClientRequest(String name) {
		this.clientName = name;
	}
	
	public void run() {
		System.out.println(clientName+"Request processing started..");
		System.out.println("=====================");
		
		try {
			Thread.sleep(1500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(clientName+" Request processing complated..");
	}
}

public class WebServerHandlingThread {

	public static void main(String[] args) {
		
		ClientRequest cr = new ClientRequest("Client1");
	
		ClientRequest cr2 = new ClientRequest("Client2");
				
		cr.start();
		cr2.start();
		
	}
}

package com.java.multithreading;
public class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("Thread1 run method executed" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
            System.out.println("my sleep got interrupted");
			}
		}
		
	} 
	
	
	
}
 class Thread3 extends Thread {

	public void run() {
		for (int i = 1; i <= 4; i++)
			System.out.println("Thread3 is running");
	}
}

package com.java.multithreading;

public class TestChild extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("TestChild run method going to start " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("TestChild run method executed");
		}
		
	}
}

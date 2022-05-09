package com.java.multithreading;

public class MainThread {
	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		Thread3 t3 = new Thread3();		
		
		t1.start();
		t1.interrupt();
		
		
		
	}
 
}

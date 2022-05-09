package com.java.multithreading;

public class MultithreadingExample {

	public static void main(String[] args) {// TODO Auto-generated method stub

//		TestChild tc = new TestChild();
//		tc.start();
//		tc.interrupt();
//		
		ChildThread ct = new ChildThread();
		ct.start();
		ct.interrupt();
//		System.out.println(ct.getState());
//		 for(int i=1; i <=5; i++) {
//				System.out.println("Main thread " + i);
//			}
		
	
		
		
//		System.out.println(ct.getState());
//		ct.start();
//		System.out.println(ct.getState());
//		//System.out.println(ct.getPriority());
//		//System.out.println(ct.getName());
//		ct.setName("FirstThread");
//		System.out.println(ct.getName());
//	
//		for(int i=1; i <=5; i++) {
//			System.out.println("MultithreadingExample thread" + i);
//		}
//		
//		System.out.println(ct.getState());
//	}
	}

}

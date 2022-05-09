package com.java.multithreading;

public class ChildThread extends Thread{
	
    public void run () {
    	
    	 for(int i=1; i <=5; i++) {
//    		 try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				System.out.println("Sleep got interupted");
//			}
				System.out.println("child thread  " + i);
			}
    }	
	
//		 th.setPriority(1);
//		 System.out.println(th.getPriority());
		
		 
		// System.out.println("main thread");
		
}

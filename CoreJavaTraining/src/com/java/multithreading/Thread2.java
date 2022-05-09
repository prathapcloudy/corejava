package com.java.multithreading;

public class Thread2 extends Thread {

	    public void run()  
	    {    
	        try  
	        {    
	            //Here current threads goes to sleeping state  
	            // Another thread gets the chance to execute  
	            Thread.sleep(500);    
	            System.out.println("javatpoint");    
	        }catch(InterruptedException e){ 
	        	e.printStackTrace();
//	            System.out.println("Exception handled "+e);    
	        }    
	        System.out.println("thread is running...");    
	    }    
	    public static void main(String args[])  
	    {    
	    	Thread2 t1=new Thread2();    
	    	Thread2 t2=new Thread2();  
	        // call run() method   
	        t1.start();   
	        // interrupt the thread   
	        t1.interrupt();    
	    }    
}

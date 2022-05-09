package com.basic.program;

//0 1  3 5 8 13
public class FibonacciDemo {
	
	public static void main(String[] args) {
		
		int n1 = 0, n3 = 1, sum = 0;
		//System.out.print(n1 + " " +n3);
		
		for (int i=0; i<10; i++) {
			
			sum =n1+n3;
			//System.out.print(" " + sum);
			n1= n3;
			n3=sum;
		}
		
		String s1="AB";
	     String s3="AB";
	     System.out.println(s1.hashCode() +" "+ s3.hashCode()); 
	}

}

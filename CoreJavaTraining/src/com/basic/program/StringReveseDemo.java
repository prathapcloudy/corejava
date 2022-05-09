package com.basic.program;

public class StringReveseDemo {

	public static void main(String[] args) {
//		
     	String name = new String("ReverseString");
//		System.out.println(name.charAt(0));
//		char[] s  = name.toCharArray();
//		System.out.println();
//		
		StringReveseDemo sr = new StringReveseDemo();
		sr.countOfWords();	
	}

	private void countOfWords() {
		String s="testing the count of words";
		int i = 0;
		int count =0;
		
		while(i<s.length()) {
			if(s.charAt(i)==' ')
			count++;
			i++;
		}
		System.out.println(count);
	
	}
	
	

}

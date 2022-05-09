package com.basic.program;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapStringInterview {

	

	public static void main(String[] args) {
		// find duplicate char in a string
	//	findDuplicateChar("vishalsubramani");

		// find duplicate words in a string
	//	findDuplicateWords("it is very very worst part of my life life");
		
		//program for reverse a string
		reverseStringValues("Humarous");
		
		
	}
	private static void reverseStringValues(String reverseStr) {
		
		
		for(int i = reverseStr.length()-1; i>=0;i--) {
			System.out.print(reverseStr.charAt(i));
		}
		
	}
	private static void findDuplicateChar(String string) {

		

		HashMap<Character, Integer> charHashMap = new HashMap<Character, Integer>();
		System.out.println(charHashMap);
		char[] ch = string.toCharArray();
		for (char c : ch) {
			if (charHashMap.containsKey(c)) {
				charHashMap.put(c, charHashMap.get(c) + 1);
			} else {
				charHashMap.put(c, 1);
			}
		}
		System.out.println(charHashMap);
		Iterator<Character> itr = charHashMap.keySet().iterator();
		while(itr.hasNext()) {
			Character temp = itr.next(); 
			if(charHashMap.get(temp) >1) {
				System.out.println("The Character " + temp +" is "+ " occured " + charHashMap.get(temp) + " times");
			}
		}	
	}

	private static void findDuplicateWords(String str) {

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String[] strArray = str.split(" ");

		for (String strName : strArray) {
			if (hashMap.containsKey(strName)) {
				hashMap.put(strName, hashMap.get(strName)+ 1);
			} else {
				hashMap.put(strName, 1);
			}
		}
		System.out.println(hashMap);
		Iterator<String> itr = hashMap.keySet().iterator();
		while(itr.hasNext()) {
			String temp = itr.next(); 
			if(hashMap.get(temp) >1) {
				System.out.println("The Word " + temp +" is "+ " occured " + hashMap.get(temp) + " times");
			}
		}		
	}
}

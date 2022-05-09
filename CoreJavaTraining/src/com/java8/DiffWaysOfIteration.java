package com.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DiffWaysOfIteration {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Cwc", "super singer", "neeya nana", "coffe with DD");

		// 1. using for loop
		System.out.println(" using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 3. using foreach and lambada
		System.out.println(" using foreach and lambada");

		list.forEach(show -> System.out.println(show));

		// 4. using iterator
		System.out.println(" using iterator");
		
		Iterator<String> tvShows = list.iterator();
		
		while(tvShows.hasNext()) {
			String shows = tvShows.next();
			System.out.println(shows);
		}
		
		// 5. using enahanced for loop
		System.out.println(" using  enahanced for loop");
		
		for (String shows : list) {
			System.out.println(shows);
		}
		
		// 4. using list iterator to traverse both direction
				System.out.println(" using list iterator to traverse both direction");
				
				ListIterator<String> tvShow = list.listIterator(list.size());
				
				while(tvShow.hasPrevious()) {
					String shows1 = tvShow.previous();
					System.out.println(shows1);
				}
		
	}

}

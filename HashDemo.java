package com.javacollections;

import java.util.*;
public class HashDemo {

	public static void main(String[] args) {
		
		//adding of numbers to Hashset
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(10);
		hs.add(15);
		hs.add(20);
		hs.add(25);
		
		// Display the elements of the set
        System.out.println("Elements in the HashSet: " + hs);
		
		//contains() usage
		System.out.println("HashSet contains Element 10 :"+ hs.contains(10));
		
		//remove an element
		hs.remove(15);
		
		//display size of collection
		System.out.println("Size of HashSet: "+ hs.size());
		
		

	}

}
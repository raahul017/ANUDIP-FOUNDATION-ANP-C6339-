package com.learning.arrays;

import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] iarray; // 1D array declaration
		int i, n;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no. of elements ");
		n=sc.nextInt();
		
		//dynamic memory allocation
		iarray = new int[n];
		
		System.out.println("Enter "+ n + " elements to the array");
		
		for(i=0;i<n;i++)
		{
			//read and store the element to the array
			iarray[i]=sc.nextInt();
		}
		
		//filter only odd numbers
		System.out.println("Odd numbers in the array ");
		for(i=0;i<n;i++)
		{
			if(iarray[i]%2>0)
				System.out.println(iarray[i]);
		}
		
	}

}
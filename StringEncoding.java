// Read a string and replace only vowels with a specific letter to perform encoding operation.
package com.stringhandling;

import java.util.Scanner;

public class StringEncoding {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Enter a string with alpha and numerals");
		String str=sc.nextLine();
		
		int i;
		
			
		for(i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
					sb.append('x');
				else
					sb.append(str.charAt(i));
			
		}
		
		System.out.println("after encoding "+ sb);
    sc.close();
	}

	}

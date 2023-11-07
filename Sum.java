package com.learning;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter the value of n:");
       int n = scanner.nextInt();
       
       System.out.print("Enter the value of x:");
       int x = scanner.nextInt();
       
       double sum = 0;
       for(int i=1; i<=n; i++)
       {
    	   if(i%2==0)
    	           sum -= (double)i/x;
    	    
    	   else
    		   sum += i/x;
    	   
       }
       scanner.close();
       
       
      System.out .println("Sum of the series is:" +sum);
	}

}

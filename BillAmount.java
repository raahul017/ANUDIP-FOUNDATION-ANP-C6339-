package com.learning;

import java.util.Scanner;


public class BillAmount {

	public static void main(String[] args) {
		
          //Initialize the scanner class
		  Scanner sc = new Scanner(System.in);
		   
		  System.out.println("Enter data used in GB");
		  
		  int data=sc.nextInt();
		  sc.close();
		  // Calculate the bill amount based on the given logic
		  //case 1
		  if(data<10)
		  {
			  System.out.println("Bill Amount is Rs.300");
		  }
		  //case 2
		  else if(data>=10 && data < 30)
		  {
			  int amount = 300 + 5 * (data - 10);
			  System.out.println("Bill Amount is Rs." +amount);
		  }
		  //case 3
		  else if (data>=30)
		  {
			  int amount = 400 + 3 * (data-30);
			  System.out.println("Bill Amount is Rs." +amount);
		  }
		  
	   }

	}
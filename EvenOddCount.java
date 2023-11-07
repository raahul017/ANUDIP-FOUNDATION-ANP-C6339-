package com.learning;

import java.util.Scanner;

public class EvenOddCount {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int evenCount = 0;
	        int oddCount = 0;
            
	        
	        int userInput;
	        do {
	            System.out.print("Enter a number: ");
	            userInput = scanner.nextInt();

	            if (userInput != -1) {
	                if (userInput % 2 == 0) {
	                    evenCount++;
	                } else {
	                    oddCount++;
	                }
	            }

	        } while (userInput != -1);

	        // Close the scanner to avoid resource leak
	        scanner.close();

	        System.out.println("Total even numbers: " + evenCount);
	        System.out.println("Total odd numbers: " + oddCount);
	    }
	}
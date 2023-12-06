package com.learning;

import java.util.Scanner;

public class AddNumbersWithLoop {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
        	
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            
            //Addition of two numbers
            int sum = a + b;
            System.out.println("Sum of Two Numbers is: " + sum);
            //press 1 to continue the process
            System.out.println("Press 1 to perform addition again, Press any key to terminate");
            choice = sc.nextInt();
            
        } while (choice == 1);

        System.out.println("End of the program.....");
    }
}

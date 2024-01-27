package com.stringhandling;

//Write a java program to accept string and change the case of each letter of the string. Display the new string.

import java.util.Scanner;

public class ChangeCase {

    public static void main(String[] args) {
        
    	// Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

       // Create a StringBuilder to store the output string
        StringBuilder result = new StringBuilder();
        
     // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();


        for (int i = 0; i < inputString.length(); i++) 
           {
            char currentChar = inputString.charAt(i);

            // Check if the character is uppercase and convert it to lowercase, or vice versa
            if (Character.isUpperCase(currentChar))
            {
                result.append(Character.toLowerCase(currentChar));
            } 
            else if (Character.isLowerCase(currentChar))
            {
                result.append(Character.toUpperCase(currentChar));
            } 
            else
            {
                // If the character is not a letter, keep it unchanged
                result.append(currentChar);
            }
        }
         
        //Display the output string
        System.out.println("Output String: " + result);
       
        //close the scanner
        scanner.close();
    }
}

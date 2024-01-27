package com.exeception;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for input
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Perform calculation based on the operator
            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Handle division by zero
                    if (num2 != 0) 
                        result = num1 / num2;
                     else {
                        System.out.println("Error: Division by zero is not allowed.");
                       
                    }
                    break;
                default:
                    // Handle invalid operator input
                    System.out.println("Error: Invalid operator entered.");
                    
            }

            // Display the result
            System.out.println("Result: " + result);

        }
        catch (java.util.InputMismatchException e) {
            // Handle non-numeric input
            System.out.println("Error: Please enter valid numeric values.");
        } 
        finally {
            // Close the scanner
            scanner.close();
        }
    }
}

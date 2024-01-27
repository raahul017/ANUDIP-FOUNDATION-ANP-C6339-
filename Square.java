package com.exeception;

import java.util.Scanner;

//Custom exception class
class NonZeroValueException extends Exception {
 public NonZeroValueException(String message) {
     super(message);
 }
}

//Class to calculate the square of a number
class SquareCalculator {
 public static double calculateSquare(double number) throws NonZeroValueException
 {
     if (number == 0)
     {
         throw new NonZeroValueException("Error: Number cannot be zero.");
     }
     else
     {
     return number * number;
     }
 }
}

//Main class to test the custom exception and square calculator
public class Square {
 public static void main(String[] args) {
	 
     Scanner scanner = new Scanner(System.in);

     try {
    	 System.out.print("Enter the Number: ");
         double inputNumber = scanner.nextDouble();
         double result = SquareCalculator.calculateSquare(inputNumber);
         System.out.println("Square of " + inputNumber + " is: " + result);
     } 
     catch (NonZeroValueException e) {
         System.out.println(e.getMessage());
     }
   }
 }


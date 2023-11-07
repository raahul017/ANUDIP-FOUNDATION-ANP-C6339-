package com.learning.arrays;

import java.util.Scanner;

public class StudentRecords {
    
	public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);

        int numStudents = 10 ;
        int[] rollNos = new int[numStudents];
        String[] names = new String[numStudents];
        double[] averageMarks = new double[numStudents];

        // Enter the 10 student records
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            rollNos[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Average Marks: ");
            averageMarks[i] = scanner.nextDouble();
        }

        // Display all student records
        System.out.println("\nStudent Records:");
        System.out.printf("%-10s%-20s%-15s\n", "Roll No", "Name", "Average Marks");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d%-20s%-15.2f\n", rollNos[i], names[i], averageMarks[i]);
        }

        // Display students with average marks above 60
        
        System.out.println("\nStudents with Average Marks above 60:");
        System.out.printf("%-10s%-20s%-15s\n", "Roll No", "Name", "Average Marks");
        for (int i = 0; i < numStudents; i++) {
            
        	if (averageMarks[i] > 60) {
                System.out.printf("%-10d%-20s%-15.2f\n", rollNos[i], names[i], averageMarks[i]);
            }
        }

        scanner.close();
    }
}
package com.javacollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerNameMap {

	public static void main(String[] args) {
        // Create a Map to store cricketer names and their scores
        Map<String, Integer> cricketScores = new HashMap<>();

        // Adding data
        cricketScores.put("Virat Kohli", 100);
        cricketScores.put("Rohit Sharma", 90);
        cricketScores.put("Dhoni", 70);
        cricketScores.put("Sachin", 200);

        // Input from the user to search for a batsman
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the batsman's name: ");
        String batsmanName = scanner.nextLine();

        // Check if the batsman is present in the Map
        if (cricketScores.containsKey(batsmanName))
        {
            // Display the score of the cricketer
            int score = cricketScores.get(batsmanName);
            System.out.println(batsmanName + "'s score is: " + score);
        } 
        else 
        {
            System.out.println("Batsman not found in the records.");
        }

        // Close the scanner
        scanner.close();
    }
}

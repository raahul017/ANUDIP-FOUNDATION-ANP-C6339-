//Write a Java program that reads an input file from the file system and outputs the content 
//of the file character by character. Use FileReader.read() method to read characters from the file.
//At the end, print the total number of characters present in the file

package com.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	

	    public static void main(String[] args) {
	        
	        
	    	try {
	            // Create a FileReader object to read the file
	            FileReader fileReader = new FileReader("C:\\Users\\Dell\\Documents\\textfile.txt");

	            int character;
	            int charCount = 0;

	            // Read characters from the file and print them
	            while ((character = fileReader.read()) != -1) {
	                System.out.print((char) character);
	                charCount++;
	            }

	            // Close the FileReader
	            fileReader.close();

	            // Print the total number of characters in the file
	            System.out.println("\nTotal number of characters: " + charCount);
	        } 
	    	catch (IOException e)
	    	{
	            System.err.println("Error reading the file: " + e.getMessage());
	        }
	    }
	}


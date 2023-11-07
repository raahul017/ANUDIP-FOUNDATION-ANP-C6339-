package com.learning;

public class Rectangle {
	     int length;
	     int width;

	    public Rectangle(int length, int width) {
	        this.length = length;
	        this.width = width;
	    }

	    public int calculateArea() {
	        return length * width;
	    }

	    public static void main(String[] args) {
	        // Instantiate two Rectangle objects with random values
	        Rectangle r1, r2;
	        r1 = new Rectangle(5,12);
	        r2 = new Rectangle(10,6);

	        // Compare the areas using the Relational Operator
	        int area1 = r1.calculateArea();
	        int area2 = r2.calculateArea();

	        // Print the result based on the comparison
	        if (area1 > area2) {
	            System.out.println("Rectangle1 > Rectangle2");
	        } else if (area1 < area2) {
	            System.out.println("Rectangle1 < Rectangle2");
	        } else {
	            System.out.println("They are equal");
	        }
	    }
	}


package com.learning;

import java.util.Scanner;

public class Bill {
	
	    int billNo;
	    String description;
	    double salesAmount;
	    double discount;
	    double amtAfterDiscount;

	    public void readBill() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Bill Number:");
	        billNo = scanner.nextInt();
	        scanner.nextLine();  // Consume the newline character
	        System.out.println("Enter Description:");
	        description = scanner.nextLine();
	        System.out.println("Enter Sales Amount:");
	        salesAmount = scanner.nextDouble();
	    }

	    void calculateBill() {
	        if (salesAmount > 50000) {
	            discount = 0.1;  // 10% discount
	        } else {
	            discount = 0.02;  // 2% discount
	        }

	        amtAfterDiscount = salesAmount - (salesAmount * discount);
	    }

	    void showBill() {
	        System.out.println("Bill Number: " + billNo);
	        System.out.println("Description: " + description);
	        System.out.println("Sales Amount: $" + salesAmount);
	        System.out.println("Discount: " + (discount * 100) + "%");
	        System.out.println("Amount After Discount: $" + amtAfterDiscount);
	    }

	    public static void main(String[] args) {
	        Bill bill1 = new Bill();
	        bill1.readBill();
	        bill1.calculateBill();
	        bill1.showBill();

	        Bill bill2 = new Bill();
	        bill2.readBill();
	        bill2.calculateBill();
	        bill2.showBill();
	    }
	    
	}


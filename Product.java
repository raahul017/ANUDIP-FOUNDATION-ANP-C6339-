package com.learning;

import java.util.Scanner;

public class Product {
     int prdid;
     String prddescription;
     String batchcode;
     double price;
     double profit;

    public void addProduct(int id, String des, String code, double pr) {
        prdid = id;
        prddescription = des;
        batchcode = code;
        price = pr;

        // Displaying information to the user
        System.out.println("Product added:");
        displayProduct();
    }

    
    private void displayProduct() {
        System.out.println("Product ID: " + prdid);
        System.out.println("Product Description: " + prddescription);
        System.out.println("Batch Code: " + batchcode);
        System.out.println("Price: " + price);
    }

    public double calculate_Profit() {
        if (price >=10000 && price <=100000) 
            profit = 0.10 * price;
        
        else if (price >= 100000 && price <= 500000) 
            profit = 0.15 * price;
         
        else if (price > 500000) 
            profit = 0.20 * price;
        

        return profit;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the Product class
        Product product = new Product();

        // Get input from the user
        System.out.print("Enter Product ID: ");
        int prdid = scanner.nextInt();
        
        System.out.print("Enter Product Description: ");
        String prddescription = scanner.next();
        
        System.out.print("Enter Batch Code: ");
        String batchcode = scanner.next();
        
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        
        

        // Call the addProduct method to set the values and display information
        product.addProduct(prdid, prddescription, batchcode, price);

        // Call calculateProfit and display the calculated profit
        double calculatedProfit = product.calculate_Profit();
        System.out.println("Calculated Profit: " + calculatedProfit);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
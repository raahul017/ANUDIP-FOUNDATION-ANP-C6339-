package com.learning.arrays;

import java.util.Scanner;

 class Invoice {

	public int invoiceid;
    public String vendorName, invoiceName, location;
    public float invoiceprice;
    //default constructor
    public Invoice() { }
  public void addInvoice()
  { 
  Scanner obj = new Scanner(System.in);
  System.out.println("Enter Invoiceid and vendorName ");
  invoiceid=obj.nextInt();
  vendorName=obj.next();
  System.out.println("Enter Invoice name and location");
  invoiceName=obj.next();
  location=obj.next();
  System.out.println("Enter Invoice price");
  invoiceprice=obj.nextFloat();
}
   public void displayInvoice()
  {
  System.out.println("\n"+ invoiceid +"\t" + vendorName +"\t" + invoiceName + 
    "\t" + invoiceprice + "\t" + location);
   }
 }
     public class ArrayofObjects {
       public static void main(String[] args) 
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number of Invoices");
         int n=sc.nextInt();
         Invoice[] invoice=new Invoice[n];
          for(int i=0; i<n; i++)
           {
              invoice[i]=new Invoice(); 
              invoice[i].addInvoice();
           }
          for(int i=0; i<n; i++)
          invoice[i].displayInvoice();
      }
}
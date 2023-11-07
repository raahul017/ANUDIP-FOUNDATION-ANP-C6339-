package com.learning;

import java.util.Scanner;

public class Employee_paybill {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		
		float basic, hra, da;
		int choice;
		
		do
		{
			System.out.println("Enter basic pay");
			basic =obj.nextFloat();
			if(basic>15000)
			{
				hra=basic*20/100;
				da= basic*60/100;
				
			}
			else
			{
				hra=3000;
				da=basic*70/100;
			}
			
			System.out.println("HRA "+ hra);
			System.out.println("DA "+ da);
			
			
			System.out.println("Do you want to continue for another Employee if yes input -1");
			choice=obj.nextInt();
			
			if(choice!= -1)
				break;
			
		}while(choice== -1);
		
		System.out.println("End of execution.");

	}

}
package com.learning;

import java.util.Scanner;

public class AllArmstrongNumbersDisplay {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int start, end, sum, r, count, n,n1, p;
		boolean flag=false;
		
		System.out.println("Enter Start limit ");
		start=obj.nextInt();
		
		System.out.println("Enter End limit ");
		end=obj.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			n1=n=i;
			count=0;
			//count no. of digits
			while(n>0)
			{
				n=n/10;
				count++;
			}
			sum=0;
			p=1;
			while(n1>0)
			{
				r=n1%10;
				p=1;
				for(int j=1;j<=count;j++)
					p=p*r;
				sum=sum+p;
				n1=n1/10;
			}
			
			if(sum==i)
			{
				System.out.println( i);
				flag=true;
			}
			
		}

		if(flag==false)
			System.out.println("from "+ start + " To "+ end + " No armstrong numbers found");

	}
	

}

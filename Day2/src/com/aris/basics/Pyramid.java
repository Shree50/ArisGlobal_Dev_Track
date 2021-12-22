package com.aris.basics;

public class Pyramid 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{  
			for(int j=1;j<=i;j++)
			{  
				System.out.print("* ");  
			}  
			System.out.println();//new line  
		}  
		System.out.println();
		int term=6;  
		for(int k=1; k<=term; k++)
		{  
			for(int l=term; l>=k; l--)
			{  
				System.out.print("* ");  
			}  
			System.out.println();//new line  
		}  

	}

}

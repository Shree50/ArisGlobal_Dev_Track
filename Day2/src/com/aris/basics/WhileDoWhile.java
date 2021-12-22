package com.aris.basics;

public class WhileDoWhile 
{

	public static void main(String[] args) 
	{
		int i = 0;    
		System.out.println("Printing the list of first 10 even numbers ");    
		while(i<=10) 
		{    
			System.out.print(i+" ");    
			i = i + 2;    
		} 
		
		int j = 0;
		System.out.println("\nPrinting the list of first 10 even numbers ");    
		do 
		{    
			System.out.print(j+" ");    
			j = j + 2;    
		}
		while(j<=10); 
	}

}

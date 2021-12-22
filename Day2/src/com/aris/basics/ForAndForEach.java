package com.aris.basics;

public class ForAndForEach 
{

	public static void main(String[] args) 
	{
		int sum = 0;  
	    for(int j = 1; j<=10; j++)
	    {  
	    	sum = sum + j;  
	    }  
	    System.out.println("The sum of first 10 natural numbers is " + sum); 
	    
	    String[] names = {"Java","C","C++","Python","JavaScript"};    
		System.out.println("\nPrinting the content of the array names:");    
		for(String name:names) 
		{    
			System.out.print(name+"\t");    
		}    
	}  

}
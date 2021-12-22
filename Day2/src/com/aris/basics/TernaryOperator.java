package com.aris.basics;

public class TernaryOperator 
{
	public static void main(String[] args) 
	{
		int a=10;  
	    int b=5;  
	    int min=(a<b)?a:b;  //check's condition?true:false
	    System.out.println("smaller\t"+min); //false = b(5)
	    
	    int max=(a>b)?a:b;  //check's condition?true:false
	    System.out.println("greater\t"+max); //true = a(10)
	    
	    System.out.println((a%2==0)?"even":"odd"); //true = even
	    System.out.println((b%2==0)?"even":"odd"); //false = odd
	    
	}

}
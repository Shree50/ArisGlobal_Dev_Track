package com.aris.basics;

public class UnaryOperator 
{

	public static void main(String[] args) 
	{
		 int x=10;  //local variable 
	     
		 System.out.println(x++);           //prints-->10 (x=11)  
	     System.out.println(++x);          //x=11    //12  
	     System.out.println(x--);         //prints-->12 (x=11)  
	     System.out.println(--x);        //x=11    //print-->x=10
	      
	     int a=10;  
	     int b=10;  
	     
	     System.out.println(a++ + ++a);              //10+12=22  
	     System.out.println(b++ + b++);             //10+11=21 
	     
	     System.out.println(a++ + ++a+"  "+(b++ + b++)); //26  25
	     System.out.println(a+"  "+b); //14  14 final value of a & b
	     
	}

}

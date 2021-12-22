package com.aris.basics;

//Calculate rectangle
public class Rectangle 
{
	int length;  
    int width;  
    public void insert(int l, int w)
    {  
      length=l;  
      width=w;  
    }  
   public void calculateArea()
   {
      System.out.println(length*width);
   }  
}

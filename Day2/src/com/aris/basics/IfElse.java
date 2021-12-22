package com.aris.basics;

public class IfElse 
{

	public static void main(String[] args) 
	{
		int x = 10;    
	    int y = 12;   
	    
	    if(x+y > 20) 
	    {    
	      System.out.println("x + y is greater than 20");    
	    }    

	    if(x+y < 10) 
	    {  
	      System.out.println("x + y is less than 10");  
	    }   
	    else
	    {  
	      System.out.println("x + y is greater than 20");  
	    }
	    
	   String city = "Delhi";  
       if(city == "Meerut") 
       {  
        System.out.println("city is meerut");  
       }
       else if (city == "Noida") 
       {  
          System.out.println("city is noida");  
       }
       else if(city == "Agra")
       {  
          System.out.println("city is agra");  
       }
       else
       {  
    	  System.out.println(city);  
       }  
       
       String address = "Delhi, India";    
       
       if(address.endsWith("India")) 
       {    
          if(address.contains("Meerut")) 
          {    
          	System.out.println("Your city is Meerut");    
          }
          else if(address.contains("Noida")) 
          {    
          	System.out.println("Your city is Noida");    
          }
          else 
          {    
          	System.out.println(address.split(",")[0]);    
          }    
       }
       else 
       {    
      	 System.out.println("You are not living in India");    
       }    
     } 
}
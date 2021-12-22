package com.aris.basics;

public class BreakContinue 
{

	public static void main(String[] args) 
	{
		 for(int i = 0; i<= 10; i++) 
		  {  
			  System.out.print(i+" ");  
			  if(i==6) 
			  {  
				  break;  
			  }  
		  }  
		 
		 System.out.println("\n");
		 for(int j = 0; j<= 2; j++) 
			{  
				for (int k = j; k<=5; k++) 
				{  
					if(k == 4) 
					{  
						continue;  
					}  
					System.out.print(k+"\t ");  
				}  
			}  

	}

}
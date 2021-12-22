package com.aris.basics;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();  
	      Employee e2=new Employee();  
	      Employee e3=new Employee();  
	      e1.insert(7,"Dhoni",45000);  
	      e2.insert(18,"Virat",50000);  
	      e3.insert(45,"Rohit",55000);  
	      e1.display();  
	      e2.display();  
	      e3.display();

	}

}

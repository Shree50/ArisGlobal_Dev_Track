package com.aris.day3;

public class Constructor1 
{
	int id;
	String name;


	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		Constructor1 c1 = new Constructor1();
		c1.display();
	
	}
}

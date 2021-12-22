package com.aris.day3;
//Parameterized Constructor
public class Student 
{
	int id;
	String name;
	
	Student(int i, String n)
	{
		id = i;
		name = n;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(45,"Rohit");
		Student s2 = new Student(18,"Virat");
		s1.display();
		s2.display();
		
	}

}

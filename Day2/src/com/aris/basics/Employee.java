package com.aris.basics;

//Maintaining records of employees.
public class Employee 
{
	int id;  
    String name;  
    float salary;  
    void insert(int i, String n, float s) 
    {  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display()
   {
     System.out.println(id+" "+name+" "+salary);
     }  
}  
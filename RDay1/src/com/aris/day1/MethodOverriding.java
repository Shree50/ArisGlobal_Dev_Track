package com.aris.day1;

public class MethodOverriding extends BaseClass
{
	@Override
	void baseMethod()
	{
		System.out.println(rollno);
		System.out.println("child class");
	}
	public static void main(String[] args) 
	{
		BaseClass override = new MethodOverriding();
		override.rollno = 200;
		override.baseMethod();
		
		BaseClass override1 = new BaseClass();
		override1.baseMethod();
		

	}

}
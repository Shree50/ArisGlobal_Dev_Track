package com.aris.basics;

public class Account 
{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a,String nme,float amt)
	{
		acc_no = a;
		name = nme;
		amount = amt;
		System.out.println(acc_no+" "+name+" "+amount);
	}
	
	void deposit(float amt)
	{
		amount = amount + amt;
		System.out.println(amount+"deposited");
	}
	
	void withdraw(float amt)
	{
		if(amount<amt)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			amount = amount - amt;
			System.out.println(amount+"withdrawn");
		}
	}
	
	void checkBalance()
	{
		System.out.println(amount+"balance left");
	}
	
	void display()
	{
		System.out.println(acc_no+" "+name+" "+amount);
	}
}

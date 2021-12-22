package com.aris.basics;

public class TestAccount 
{

	public static void main(String[] args) 
	{
		Account a1 = new Account();
		a1.insert(8553,"Shree",50000);
		a1.deposit(1000);
		a1.checkBalance();
		a1.withdraw(5000);
		a1.checkBalance();
		a1.display();
	}

}

package com.aris.day3;

public class Constructor 
{
		int id;
		String name;
		
		Constructor(int a,String nm)
		{
			id = a;
			name = nm;
		}
		
		void display()
		{
			System.out.println(id+" "+name);
		}
		public static void main(String[] args) 
		{
			Constructor c1 = new Constructor(50,"Shree");
			Constructor c2 = new Constructor(45,"Rohit");
			c1.display();
			c2.display();
		}

}
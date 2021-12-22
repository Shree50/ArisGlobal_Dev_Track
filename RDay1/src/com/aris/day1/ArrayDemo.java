package com.aris.day1;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		Student[] name=new Student[5];
		for(int i=0;i<name.length;i++)
		{
		 name[i]=new Student();
		}
		
			name[0].setId("7");
			name[0].setName("Dhoni");
			name[0].setAge(38);
		
			name[1].setId("18");
			name[1].setName("Kohli");
			name[1].setAge(32);
		
			
			name[2].setId("45");
			name[2].setName("Rohit");
			name[2].setAge(32);
		
		 for(Student s:name)
		 {
			 System.out.println(s.toString());
		 }
	

	}

}

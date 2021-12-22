package com.aris.stream;

import java.util.Random;

public class LimitDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Random random=new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);
	}

}

package com.aris.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> ls =new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		
		//ls.forEach(System.out::println);
		
		List<Integer> ls1 = ls.stream().map(number->number*number).collect(Collectors.toList());
		ls1.forEach(System.out::println);
		
	}

}

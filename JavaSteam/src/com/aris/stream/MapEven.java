package com.aris.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapEven 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> ls =new ArrayList<Integer>();
		ls.add(400);
		ls.add(100);
		ls.add(16);
		ls.add(43);
		ls.add(2020);
		
		//ls.forEach(System.out::println);
		
		List<String> ls1 = ls.stream().map(n->(n%400==0 || n%4==0 && n%100!=0)?n+"\tLeap Year":n+"\tNot Leap Year").collect(Collectors.toList());
		ls1.forEach(System.out::println);
	}

}

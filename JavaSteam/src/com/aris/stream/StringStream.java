package com.aris.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> ls =new ArrayList<String>();
		ls.add("java");
		ls.add("python");
		ls.add("c");
		ls.add("c++");
		ls.add("c#");
		
		//ls.forEach(System.out::println);
		
		//List<String> ls1 = ls.stream().map(n-> n).collect(Collectors.toList());
		//ls1.forEach(System.out::println);
		
		List<String> ls1 = ls.stream().map(String::toUpperCase).collect(Collectors.toList());
		ls1.forEach(System.out::println);
		
	}

}

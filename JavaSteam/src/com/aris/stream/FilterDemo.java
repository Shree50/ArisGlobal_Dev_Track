package com.aris.stream;

import java.util.Arrays;
import java.util.List;

public class FilterDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> ls = Arrays.asList("Abc","","","abd");
		
		long count = ls.stream().filter(s->s.isEmpty()).count();
		System.out.println(count);
	}

}

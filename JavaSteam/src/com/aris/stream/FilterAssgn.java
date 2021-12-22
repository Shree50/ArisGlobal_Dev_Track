package com.aris.stream;

import java.util.Arrays;
import java.util.List;

public class FilterAssgn 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(2020,16,100,400,2016,43,72);
		
		long count = ls.stream().filter(s->(s%400==0 || s%4==0 && s%100!=0)).count();
		System.out.println("Count Leap Years : "+count);
	}

}

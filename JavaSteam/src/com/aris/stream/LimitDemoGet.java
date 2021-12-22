package com.aris.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class LimitDemoGet 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> ls=Arrays.asList(1,2,3,35,50,25,33);
		System.out.println(ls.stream().limit(2).collect(Collectors.toList()));
		ls.stream().sorted().forEach(System.out::println);
		
		IntSummaryStatistics stats = ls.stream().mapToInt(x->x).summaryStatistics();
		
		System.out.println("Max Number"+stats.getMax());
		System.out.println("Min Number"+stats.getMin());
		System.out.println("Sum Number"+stats.getSum());
		System.out.println("Average Number"+stats.getAverage());
	}

}

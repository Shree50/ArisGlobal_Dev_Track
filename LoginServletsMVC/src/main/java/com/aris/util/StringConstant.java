package com.aris.util;

public class StringConstant 
{
	public static final String url="jdbc:mysql://localhost:3306/student";
	//?characterEncoding=utf8
	public static final String username="root";
	public static final String password="Shree50!";	
	public static final String mysqlLoadingClass="com.mysql.cj.jdbc.Driver";
	public static final String loginQuery="select * from login where username = ? and password=?";
}
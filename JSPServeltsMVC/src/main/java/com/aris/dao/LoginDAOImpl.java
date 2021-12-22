package com.aris.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.aris.model.LoginDetailsModel;
import com.aris.util.JDBCConnection;
import com.aris.util.StringConstant;

public class LoginDAOImpl 
{
JDBCConnection connector=new JDBCConnection();
	
	public boolean checkForAuth(LoginDetailsModel model)
	{
		return getUserAndPassword(model) && getCheckOTP("100");
	}
	
	public boolean getUserAndPassword(LoginDetailsModel model)
	{
		try
		{
		
		Connection con=connector.getConnection();
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery(StringConstant.loginQuery);  
		while(rs.next())
		{	
		String server_username=rs.getString(2);
		String server_password=rs.getString(3);
		  
		if(model.getUsername().equalsIgnoreCase(server_username) && model.getPassword().equalsIgnoreCase(server_password))
		{
			return true;
		}
		
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			connector.closeConnection();
		}
		
		return false;
	}
	public boolean getCheckOTP(String otp)
	{
		
		//logic for checkingotp
		return false;
	}
	}


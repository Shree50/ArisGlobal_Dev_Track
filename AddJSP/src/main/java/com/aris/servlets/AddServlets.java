package com.aris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlets extends HttpServlet 
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String no1 = req.getParameter("num1");
		String no2 = req.getParameter("num2");
		
		int c = Integer.parseInt(no1)+Integer.parseInt(no2);
		PrintWriter out = resp.getWriter();
		out.println("Sum is"+c);
		
		req.setAttribute("number1", no1);
		req.setAttribute("number2", no2);
		RequestDispatcher rd = req.getRequestDispatcher("output.jsp");
		rd.forward(req, resp);
		
	}
	
}

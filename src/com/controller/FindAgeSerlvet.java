package com.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindAgeSerlvet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		System.out.println("FindAgeServlet::service()");
		int byear = Integer.parseInt( request.getParameter("byear"));
		//1988
		//2022-1988
		Calendar c = Calendar.getInstance(); 
		int currentYear = c.get(Calendar.YEAR);
		
		int age = currentYear-byear;
		
		request.setAttribute("age",age);

		RequestDispatcher rd = request.getRequestDispatcher("AgeResult.jsp");
		rd.forward(request, response);
		
	}
}
//shark tank --> 1 lack users --> 
//filter --> 250 request accepted -->
//250 --> idea --> 


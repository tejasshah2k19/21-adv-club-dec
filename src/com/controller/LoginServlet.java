package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	String correctEmail = "";
	String correctPassword = "";

	public void init(ServletConfig config) throws ServletException {
			correctEmail = config.getInitParameter("email");
			correctPassword = config.getInitParameter("password");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (email.equals(correctEmail) && password.equals(correctPassword)) {
			// success
			System.out.println("success....");
		} else {
			// fail
			System.out.println("fail.....");
		}

	}

}

//email 
//password 
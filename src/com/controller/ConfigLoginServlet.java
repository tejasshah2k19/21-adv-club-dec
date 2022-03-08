package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigLoginServlet extends HttpServlet {

	String correctEmail = "";// credentials
	String correctPassword = "";

//	public void init(ServletConfig config) throws ServletException {
//	
//		this.correctEmail = config.getInitParameter("email");
//		this.correctPassword = config.getInitParameter("password");
//	}
//	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletConfig config = getServletConfig();
		this.correctEmail = config.getInitParameter("email");
		this.correctPassword = config.getInitParameter("password");

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (email.equals(correctEmail) && password.equals(correctPassword)) {
			response.sendRedirect("ConfigHome.jsp");
		} else {
			response.sendRedirect("ConfigLogin.jsp");
		}

	}
}

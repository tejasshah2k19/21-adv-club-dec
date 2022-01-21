package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionLoginServlet")
public class SessionLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		HttpSession session = request.getSession();// server
		session.setAttribute("email", email);
		session.setAttribute("password", password);

		session.setMaxInactiveInterval(180);//seconds -- 2minutes 
		
		RequestDispatcher rd = request.getRequestDispatcher("SessionHome.jsp");
		rd.forward(request, response);

	}
}

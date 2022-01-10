package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HTLoginServlet")
public class HTLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		//password --> admin 
		RequestDispatcher rd = null; 
		
		if(password.equals("admin")) {
			//goto Menu.jsp 
			//
			Cookie cookie = new Cookie("email", email);
			response.addCookie(cookie);
			rd = request.getRequestDispatcher("HTMenu.jsp");
		}else {
			//goto Login.jsp --> msg invalid credentials 
			//servlet --> jsp --> msg / data 
			request.setAttribute("msg", "Invalid Credentials");

			rd = request.getRequestDispatcher("HTLogin.jsp");
		}
		
		rd.forward(request, response);
		
	}

}

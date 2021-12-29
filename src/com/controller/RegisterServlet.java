package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//annotation 
@WebServlet("/RegisterServlet") // -> web.xml
public class RegisterServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String city = request.getParameter("city");

		boolean isError = false;
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		} else {
			request.setAttribute("firstNameValue", firstName);

		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");

		} else {
			request.setAttribute("emailValue", email);
		}

		if (city == null || city.equals("-1")) {
			isError = true;
			request.setAttribute("cityError", "Please Select City");
		}else {
			request.setAttribute("cityValue", city);//ahd barod ad 
		}

		RequestDispatcher rd = null;
		if (isError == true) {
			// Registration.jsp
			rd = request.getRequestDispatcher("Registration.jsp");
		} else {
			// Home.jsp --> success
			rd = request.getRequestDispatcher("Home.jsp");
		}

		rd.forward(request, response);

	}
}

package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("inside SignupServlet....");

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);

		response.setContentType("text/html");// what type of response....MIME
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("<br>FirstName => " + firstName);
		out.print("<Br>Email => " + email);
		out.print("<br>Password => " + password);

		out.print("</body>");
		out.print("</html>");

	}

}

package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");

		response.setContentType("text/html"); // MIME

		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");

		out.print("FirstName : " + firstName.toUpperCase());
		out.print("<br>Gender : " + gender);
		out.print("<br>DoB : " + dob);

		out.print("</body>");
		out.print("</html>");

	}
}

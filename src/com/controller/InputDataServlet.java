package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputDataServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String birthYear = request.getParameter("birthYear");
		String gender = request.getParameter("gender");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("Name : " + name.toUpperCase() + "<br>");
		out.print("BirthYear : " + birthYear);
		out.print("<br>Gender : " + gender.toUpperCase());
		out.print("</body></html>");

	}

}

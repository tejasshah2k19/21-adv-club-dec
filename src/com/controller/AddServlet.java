package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int n1 = Integer.parseInt(request.getParameter("n1"));// Wrapper --> Integer
		int n2 = Integer.parseInt(request.getParameter("n2"));
//7
		String operation = request.getParameter("operation");// add sub mul div
		int ans = 0;

		switch (operation) {
		case "+":
			ans = n1 + n2;
			break;
		case "-":
			ans = n1 - n2;
			break;
		case "*":
			ans = n1 * n2;
			break;
		case "/":
			ans = n1 / n2;
			break;
		default:
			ans = -1;
			break;
		}

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");// text/html --> MIME

		out.print("<html>");
		out.print("<body>");
		out.print(n1 + " " + operation + " " + n2 + " = " + ans); // 20 + 30 = 50
		out.print("</body>");
		out.print("</html>");

	}
}

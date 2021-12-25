package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrencyConvertorServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int inr = Integer.parseInt(request.getParameter("inr"));// inr 1500

		String curr = request.getParameter("curr");
		int amount = 0;
		switch (curr) {
		case "usd":
			amount = inr / 75;
			break;
		case "aud":
			amount = inr / 55;

			break;
		case "pound":
			amount = inr / 100;
			break;

		default:
			break;
		}

		// servlet-->jsp ---> data
		request.setAttribute("amount", amount);

		// goto CurrConvertor.jsp
		RequestDispatcher rd = request.getRequestDispatcher("CurrConvertor.jsp");
		rd.forward(request, response);

		 
//		response.setContentType("text/html");
//		PrintWriter pw = response.getWriter();
//
//		pw.print("<html>");
//		pw.print("<body>");
//		pw.print(amount);
//		pw.print("<body>");
//		pw.print("</html>");

	}

}

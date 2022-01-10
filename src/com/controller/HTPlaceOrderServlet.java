package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.MenuItem;

@WebServlet("/HTPlaceOrderServlet")
public class HTPlaceOrderServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int total = 0;
		String choice[] = request.getParameterValues("choice");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Cookie cookies[] = request.getCookies();
		String email = "";
		for(Cookie x:cookies) {
			if(x.getName().equals("email")) {
				email = x.getValue();
			}
		}
		
		out.print("<html><body>");
		
		out.print("Hey ,"+email+"<br><bR>");
		for (String c : choice) {
			out.print(c + " : ");
			out.print(MenuItem.menu.get(c));
			total = total + MenuItem.menu.get(c);
			out.print("<br>");
		}

		out.print("<br>total =>" + total);
		out.print("<br>GST => " + (total * 0.18));
		out.print("<br>TOTAL Pay  => " + (total + (total * 0.18)));

		out.print("</body></html>");

	}
}
